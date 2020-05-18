package me.wiput.factory;

public class PizzaFactory {

  public Pizza orderPizza(String type, char size) {
    Pizza p = new Pizza("default", size);

    if (type.equals("pepperoni")) {
      p = new PepperoniPizza(size);
    } else if (type.equals("hawaiian")) {
      p = new HawaiianPizza(size);
    }

    p.prepare();
    p.bake();
    p.box();
    return p;
  }

}
