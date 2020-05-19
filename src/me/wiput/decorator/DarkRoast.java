package me.wiput.decorator;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    this.description = "Dark Roast";
  }

  public double cost() {
    return 2.19;
  }
}
