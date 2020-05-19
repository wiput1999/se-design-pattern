package me.wiput.proxy;

public class CrawlerProxy implements Crawler {

  private Crawler crawler;

  public CrawlerProxy() {
  }

  @Override
  public void crawlTargetContent() {
    crawler = new AggressiveCrawler();
    crawler.crawlTargetContent();
  }
}
