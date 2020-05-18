package me.wiput.adapter;

public class RoundHole {

  private double radius;

  public RoundHole(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public boolean isFit(RoundPeg peg) {
    return this.getRadius() >= peg.getRadius();
  }
}
