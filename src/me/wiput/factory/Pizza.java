package me.wiput.factory;

public class Pizza {

  private String type;
  private char size;

  public Pizza(String type, char size) {
    this.type = type;
    this.size = size;
  }

  public void prepare() {
    System.out.println("Prepare : " + type + " " + size);
  }

  public void bake() {
    System.out.println("Bake : " + type + " " + size);
  }

  public void box() {
    System.out.println("Box : " + type + " " + size);
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "type='" + type + '\'' +
        ", size=" + size +
        '}';
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public char getSize() {
    return size;
  }

  public void setSize(char size) {
    this.size = size;
  }
}
