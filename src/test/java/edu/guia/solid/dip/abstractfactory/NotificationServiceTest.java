package edu.guia.solid.dip.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NotificationServiceTest {
  @Test
  void serviceUsesInjectedChannel() {
    FakeChannel fake = new FakeChannel();
    NotificationService svc = new NotificationService(fake);
    svc.notify("john@doe", "Hello");
    assertEquals("john@doe", fake.lastTo);
    assertEquals("Hello", fake.lastMessage);
  }
  @Test
  void factoryCreatesChannelsByVendor() {
    ChannelFactory f = new ChannelFactory();
    assertTrue(f.create("email") instanceof EmailChannel);
    assertTrue(f.create("sms") instanceof SmsChannel);
  }
}