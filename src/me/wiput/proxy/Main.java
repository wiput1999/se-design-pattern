package me.wiput.proxy;

public class Main {

  public static void main(String[] args) {

    System.out.println("=== Image Proxy ===");
    Image highResolutionImage1 = new ImageProxy("hello.jpg");
    Image highResolutionImage2 = new ImageProxy("hello2.jpg");
    Image highResolutionImage3 = new ImageProxy("hello3.jpg");

    highResolutionImage1.showImage();
    highResolutionImage2.showImage();
    highResolutionImage3.showImage();

    System.out.println("=== Crawler Proxy ===");
    Crawler crawler1 = new CrawlerProxy();
    Crawler crawler2 = new CrawlerProxy();

    crawler1.crawlTargetContent();
    crawler2.crawlTargetContent();
  }

}
