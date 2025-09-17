package edu.guia.solid.dip.abstractfactory;

public class ChannelFactory {
    public NotificationChannel create(String vendor) {
        return switch (vendor.toLowerCase()) {
            case "email" -> new EmailChannel();
            case "sms" -> new SmsChannel();
            default -> throw new IllegalArgumentException("Unknown vendor: " + vendor);
        };
    }
}
