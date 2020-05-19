package me.wiput.proxy;

public class HighResolutionImage implements Image {

  private String imageFilePath;

  public HighResolutionImage(String imageFilePath) {
    this.imageFilePath = imageFilePath;
  }

  @Override
  public void showImage() {
    System.out.println("Show image from path : " + imageFilePath);
  }
}
