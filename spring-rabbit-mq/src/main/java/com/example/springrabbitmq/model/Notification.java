package com.example.springrabbitmq.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Notification implements Serializable {


    private int notificationId;

    private LocalDate createdAt;

    private boolean isSeen;

    private String message;


    public Notification(int notificationId, LocalDate createdAt, boolean isSeen, String message) {
        this.notificationId = notificationId;
        this.createdAt = createdAt;
        this.isSeen = isSeen;
        this.message = message;
    }


    public Notification() {
    }


    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "NotificationListener{" +
                "notificationId=" + notificationId +
                ", createdAt=" + createdAt +
                ", isSeen=" + isSeen +
                ", message='" + message + '\'' +
                '}';
    }



}
