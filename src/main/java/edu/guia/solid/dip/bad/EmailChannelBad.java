package edu.guia.solid.dip.bad;

public class EmailChannelBad {
  public static int sentCount = 0;
  public void send(String to, String message){ sentCount++; }
}