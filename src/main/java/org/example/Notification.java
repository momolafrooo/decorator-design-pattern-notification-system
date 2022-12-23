package org.example;

public abstract class Notification {
    protected User user;
    protected String content;
    protected String name;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendNotification() {
        System.out.println("Notification envoyée à " + user.getFullName() + " par " + getName());
    }

    @Override
    public String toString() {
        return "Notification{" +
                "user=" + user +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
