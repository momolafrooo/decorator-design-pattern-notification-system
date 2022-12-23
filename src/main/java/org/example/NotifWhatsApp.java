package org.example;

public class NotifWhatsApp extends Decorator {
    public NotifWhatsApp(Notification notif) {
        setNotification(notif);
        setUser(notif.getUser());
        setContent(content);
        setName("WhatsApp");
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("Notification envoyée à " + super.notification.getUser().getFullName() + " par " + super.getName());
    }
}
