package org.example;

public abstract class Decorator extends Notification {
    protected Notification notification;

    @Override
    public void sendNotification() {
        notification.sendNotification();
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
