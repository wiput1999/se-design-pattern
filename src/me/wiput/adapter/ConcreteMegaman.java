package me.wiput.adapter;

public class ConcreteMegaman implements Megaman {

  @Override
  public void fire() {
    System.out.println("Fire!!!");
  }

  @Override
  public void sprint() {
    System.out.println("Sprint!!!");
  }
}
