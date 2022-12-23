package org.example;

public class NotifSms extends Decorator {

    public NotifSms(Notification notif) {
        setNotification(notif);
        setUser(notif.getUser());
        setContent(content);
        setName("SmS");
    }

    @Override
    public void sendNotification() {
        notification.sendNotification();
        System.out.println("Notification envoyée à " + notification.getUser().getFullName() + " par " + getName());
    }
}
