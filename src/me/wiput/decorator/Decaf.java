package me.wiput.decorator;

public class Decaf extends Beverage {

  public Decaf() {
    this.description = "Decaf";
  }

  @Override
  public double cost() {
    return 2.09;
  }
}
