package edu.guia.solid.dip.abstractfactory;

public class FakeChannel implements NotificationChannel {
    public String lastTo;
    public String lastMessage;

    public void send(String to, String message) {
        lastTo = to;
        lastMessage = message;
    }
}
