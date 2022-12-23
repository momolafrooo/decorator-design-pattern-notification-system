package org.example;

public class NotifEmail extends Notification {

    public NotifEmail(User user, String content) {
        setUser(user);
        setContent(content);
        setName("Email");
    }
}
