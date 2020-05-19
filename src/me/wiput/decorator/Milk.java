package me.wiput.decorator;

public class Milk extends CondimentDecorator {

  Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }

  public double cost() {
    return .30 + beverage.cost();
  }
}
