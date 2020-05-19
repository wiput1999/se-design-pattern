package me.wiput.facade;

public class Main {

  public static void main(String[] args) {
    SmartHomeFacade smartHomeFacade = new SmartHomeFacade();

    System.out.println("==========");
    smartHomeFacade.arriveHome();

    System.out.println("==========");
    smartHomeFacade.arriveHomeLate();

    System.out.println("==========");
    smartHomeFacade.departHome();
  }
}
