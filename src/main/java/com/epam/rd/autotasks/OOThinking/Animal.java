package com.epam.rd.autotasks.OOThinking;

import java.util.concurrent.atomic.AtomicInteger;


public class Animal implements Feedable {
    private static final AtomicInteger idCounter = new AtomicInteger(1);
    private String species;
    private String name;
    private int animalID;
    private int feedingCount;
    private FeedingSchedule feedingSchedule;

    public Animal() {
        this.animalID = idCounter.getAndIncrement();
    }

    public FeedingSchedule getFeedingSchedule() {
        return feedingSchedule;
    }

    public void setFeedingSchedule(FeedingSchedule feedingSchedule) {
        this.feedingSchedule = feedingSchedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAnimalID() {
        return animalID;
    }

    public int getFeedingCount() {
        return feedingCount;
    }

    public void incrementFeedingCount() {
        feedingCount++;
    }

    @Override
    public void feed(Food food, int quantity) {
        System.out.println("Feeding " + name + " with " + quantity + " units of " + food.getFoodType());
        incrementFeedingCount();
    }
}
