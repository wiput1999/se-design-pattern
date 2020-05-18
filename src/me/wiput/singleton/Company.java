package me.wiput.singleton;

public class Company {

  private static Company instance;

  private String name;
  private String address;
  private double share;
  private double stockPrice;

  public Company() {
  }

  public static Company getInstance() {
    if (instance == null) {
      instance = new Company();
    }
    return instance;
  }

  @Override
  public String toString() {
    return "Company{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", share=" + share +
        ", stockPrice=" + stockPrice +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public double getShare() {
    return share;
  }

  public void setShare(double share) {
    this.share = share;
  }

  public double getStockPrice() {
    return stockPrice;
  }

  public void setStockPrice(double stockPrice) {
    this.stockPrice = stockPrice;
  }
}
