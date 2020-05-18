package me.wiput.singleton;

public class Main {

  public static void main(String[] args) {
    Company company = Company.getInstance();

    company.setName("AIS");
    company.setAddress("AIS Tower");
    company.setShare(500000);
    company.setStockPrice(5.2);

    System.out.println(company);
  }
}
