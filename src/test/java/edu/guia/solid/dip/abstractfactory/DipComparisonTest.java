package edu.guia.solid.dip.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import edu.guia.solid.dip.bad.EmailChannelBad;
import edu.guia.solid.dip.bad.TightCoupledNotificationService;
import org.junit.jupiter.api.Test;

public class DipComparisonTest {
  @Test
  void badIsTightlyCoupledAndNotInjectable(){
    EmailChannelBad.sentCount = 0;
    new TightCoupledNotificationService().notify("a","b");
    assertEquals(1, EmailChannelBad.sentCount);
  }
  @Test
  void goodIsInjectableAndTestable(){
    FakeChannel fake = new FakeChannel();
    NotificationService svc = new NotificationService(fake);
    svc.notify("a","b");
    assertEquals("a", fake.lastTo);
    assertEquals("b", fake.lastMessage);
  }
}