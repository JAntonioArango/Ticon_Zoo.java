package com.epam.rd.autotasks.OOThinking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Users
        User adminUser = new User();
        adminUser.setName("Alice Smith");
        adminUser.setRole(Roles.ADMIN);
        adminUser.manageUsers();

        User nutritionistUser = new User();
        nutritionistUser.setName("John Doe");
        nutritionistUser.setRole(Roles.NUTRITIONIST);

        User zootechnicianUser = new User();
        zootechnicianUser.setName("Jane Brown");
        zootechnicianUser.setRole(Roles.ZOOTECHNICIAN);

        // Create Animals
        Animal lion = new Animal();
        lion.setName("Lion");
        lion.setSpecies("Panthera leo");

        Animal tiger = new Animal();
        tiger.setName("Tiger");
        tiger.setSpecies("Panthera tigris");

        // Create Food
        Food meat = new Food();
        meat.setFoodType("Meat");
        meat.setStockQuantity(100);

        // Create Feeding Schedules by Nutritionist
        if (nutritionistUser.getRole() == Roles.NUTRITIONIST) {
            FeedingSchedule lionSchedule = new FeedingSchedule();
            lionSchedule.setFrequencyPerDay(2);
            lionSchedule.setFood(meat);
            lionSchedule.setQuantityPerFeeding(5);
            lionSchedule.createSchedule(lion);

            FeedingSchedule tigerSchedule = new FeedingSchedule();
            tigerSchedule.setFrequencyPerDay(3);
            tigerSchedule.setFood(meat);
            tigerSchedule.setQuantityPerFeeding(4);
            tigerSchedule.createSchedule(tiger);
        } else {
            System.out.println("Access denied. Only NUTRITIONIST can create feeding schedules.");
        }

        // Feed Animals by Zootechnician
        if (zootechnicianUser.getRole() == Roles.ZOOTECHNICIAN) {
            lion.feed(meat, 5);
            tiger.feed(meat, 4);
        } else {
            System.out.println("Access denied. Only ZOOTECHNICIAN can feed animals.");
        }

        // Record Feeding Events
        FeedingEvent lionFeeding1 = new FeedingEvent();
        lionFeeding1.recordFeedingEvent(zootechnicianUser, lion, meat, 5);

        FeedingEvent tigerFeeding1 = new FeedingEvent();
        tigerFeeding1.recordFeedingEvent(zootechnicianUser, tiger, meat, 4);

        // Create List of Feeding Events
        List<FeedingEvent> feedingEvents = new ArrayList<>();
        feedingEvents.add(lionFeeding1);
        feedingEvents.add(tigerFeeding1);

        // Generate Report
        Report report = new Report();
        report.generateReport(nutritionistUser, feedingEvents, "Feeding went as planned.");
        report.displayReport();

    }
}
