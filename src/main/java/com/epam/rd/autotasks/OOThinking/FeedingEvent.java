package com.epam.rd.autotasks.OOThinking;

import java.util.concurrent.atomic.AtomicInteger;

public class FeedingEvent {
    private static final AtomicInteger idCounter = new AtomicInteger(1);
    private int eventID;
    private Animal animal;
    private User user;
    private Food food;
    private int quantity;

    public FeedingEvent() {
        this.eventID = idCounter.getAndIncrement();
    }

    public int getEventID() {
        return eventID;
    }

    public Animal getAnimal() {
        return animal;
    }

    public User getUser() {
        return user;
    }

    public Food getFood() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void recordFeedingEvent(User user, Animal animal, Food food, int quantity) {
        this.user = user;
        this.animal = animal;
        this.food = food;
        this.quantity = quantity;
        animal.incrementFeedingCount();
    }
}
