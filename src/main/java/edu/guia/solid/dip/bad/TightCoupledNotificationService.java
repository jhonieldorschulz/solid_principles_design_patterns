package edu.guia.solid.dip.bad;

public class TightCoupledNotificationService {
  public void notify(String to, String msg){
    EmailChannelBad ch = new EmailChannelBad(); // acoplado ao detalhe
    ch.send(to, msg);
  }
}