package me.wiput.decorator;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    this.description = "House Blend";
  }

  public double cost() {
    return 2.49;
  }
}
