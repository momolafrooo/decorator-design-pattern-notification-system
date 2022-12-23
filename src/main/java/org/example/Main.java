package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("momo@momo.com");
        user.setFirstName("momo");
        user.setLastName("fall");

        Notification emailSmsWhatsapp = new NotifSms(new NotifWhatsApp(new NotifEmail(user, "Bonjour")));
        emailSmsWhatsapp.sendNotification();
    }
}