package me.wiput.factory;

public class Main {

  public static void main(String[] args) {
    PizzaFactory factory = new PizzaFactory();

    Pizza pepperoni = factory.orderPizza("pepperoni", 'L');
    System.out.println(pepperoni);

    Pizza hawaiian = factory.orderPizza("hawaiian", 'L');
    System.out.println(hawaiian);
  }
}
