package com.epam.rd.autotasks.OOThinking;

public class FeedingSchedule {
    private int scheduleID;
    private int frequencyPerDay;
    private Food food;
    private int quantityPerFeeding;

    public int getScheduleID() {
        return scheduleID;
    }

    public int getFrequencyPerDay() {
        return frequencyPerDay;
    }

    public void setFrequencyPerDay(int frequencyPerDay) {
        this.frequencyPerDay = frequencyPerDay;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getQuantityPerFeeding() {
        return quantityPerFeeding;
    }

    public void setQuantityPerFeeding(int quantityPerFeeding) {
        this.quantityPerFeeding = quantityPerFeeding;
    }

    public void createSchedule(Animal animal) {
        animal.setFeedingSchedule(this);
    }

    public void updateSchedule(int frequency, Food food, int quantity) {
        this.frequencyPerDay = frequency;
        this.food = food;
        this.quantityPerFeeding = quantity;
    }
}
