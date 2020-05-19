package me.wiput.proxy;

public class ImageProxy implements Image {

  private String imageFilePath;

  private Image proxifiedImage;

  public ImageProxy(String imageFilePath) {
    this.imageFilePath = imageFilePath;
  }

  @Override
  public void showImage() {
    proxifiedImage = new HighResolutionImage(imageFilePath);

    proxifiedImage.showImage();
  }
}
