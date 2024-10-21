package com.epam.rd.autotasks.OOThinking;

import java.util.concurrent.atomic.AtomicInteger;

public class User implements Manageable{
    private static final AtomicInteger idCounter = new AtomicInteger(1);
    private int userID;
    private String name;
    private Roles role;

    public User() {
        this.userID = idCounter.getAndIncrement();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public void manageUsers() {
        if (role == Roles.ADMIN) {
            System.out.println("Managing users");
        } else {
            System.out.println("Access denied. Only ADMIN can manage users.");
        }
    }
}
