package me.wiput.facade;

public class SmartHomeFacade {

  private BedroomFacade bedroomFacade = new BedroomFacade();
  private GarageLight garageLight = new GarageLight();
  private Alarm alarm = new Alarm();

  public void arriveHome() {
    System.out.println("Smart Home : Arrive home");
    alarm.disarm();
    garageLight.on();
  }

  public void arriveHomeLate() {
    System.out.println("Smart Home : Arrive home late");
    alarm.arm();
    garageLight.on();
    bedroomFacade.getToBed();
  }

  public void departHome() {
    System.out.println("Smart Home : Depart home");
    alarm.arm();
    garageLight.off();
    bedroomFacade.departHome();
  }
}
