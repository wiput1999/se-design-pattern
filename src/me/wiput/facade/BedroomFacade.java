package me.wiput.facade;

public class BedroomFacade {

  private Light light = new Light();
  private AirPurifier airPurifier = new AirPurifier();
  private AirCondition airCondition = new AirCondition();

  public void getToBed() {
    System.out.println("Bedroom : Get to bed");
    light.turnOff();
    airCondition.turnOn();
    airPurifier.turnOn();
  }

  public void wakeUp() {
    System.out.println("Bedroom : Wake up");
    light.turnOn();
    airCondition.turnOff();
    airPurifier.turnOff();
  }

  public void departHome() {
    System.out.println("Bedroom : Depart home");
    light.turnOff();
    airCondition.turnOff();
    airPurifier.turnOff();
  }
}
