package com.epam.rd.autotasks.OOThinking;

import java.util.List;

public class Report {
    private int reportID;
    private User generatedBy;
    private List<FeedingEvent> feedingEventList;
    private String comments;

    public int getReportID() {
        return reportID;
    }

    public User getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(User generatedBy) {
        this.generatedBy = generatedBy;
    }

    public List<FeedingEvent> getFeedingEventList() {
        return feedingEventList;
    }

    public void setFeedingEventList(List<FeedingEvent> feedingEventList) {
        this.feedingEventList = feedingEventList;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void generateReport(User user, List<FeedingEvent> feedingEventList, String comments) {
        this.generatedBy = user;
        this.feedingEventList = feedingEventList;
        this.comments = comments;
    }

    public void displayReport() {
        System.out.println("Report generated by: " + generatedBy.getName()
                + " (User ID: " + generatedBy.getUserID() + ")");

        for (FeedingEvent event : feedingEventList) {
            System.out.println("Animal: " + event.getAnimal().getName()
                    + " (Animal ID: " + event.getAnimal().getAnimalID() + ")"
                    + ", Food: " + event.getFood().getFoodType()
                    + " (Food ID: " + event.getFood().getFoodID() + ")"
                    + ", Quantity: " + event.getQuantity());
        }

        System.out.println("Comments: " + comments);
    }

}
