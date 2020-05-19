package me.wiput.proxy;

public class AggressiveCrawler implements Crawler {

  @Override
  public void crawlTargetContent() {
    System.out.println("Aggressive Crawler");
  }
}
