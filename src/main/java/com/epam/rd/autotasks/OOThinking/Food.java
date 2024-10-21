package com.epam.rd.autotasks.OOThinking;

import java.util.concurrent.atomic.AtomicInteger;

public class Food {
    private static final AtomicInteger idCounter = new AtomicInteger(1);
    private int foodID;
    private String foodType;
    private int stockQuantity;

    public Food() {
        this.foodID = idCounter.getAndIncrement();
    }

    public int getFoodID() {
        return foodID;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void updateStockQuantity(int quantity) {
        this.stockQuantity += quantity;
    }
}
