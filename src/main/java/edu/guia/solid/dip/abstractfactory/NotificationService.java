package edu.guia.solid.dip.abstractfactory;

public class NotificationService {
    private final NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void notify(String to, String msg) {
        channel.send(to, msg);
    }
}
