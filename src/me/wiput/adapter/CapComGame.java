package me.wiput.adapter;

public class CapComGame {
  private Rockman rockMan;

  public CapComGame(Rockman rockMan) {
    this.rockMan = rockMan;
  }

  public void play() {
    rockMan.shoot();
    rockMan.slide();
    rockMan.shoot();
    rockMan.slide();
    rockMan.slide();
  }
}
