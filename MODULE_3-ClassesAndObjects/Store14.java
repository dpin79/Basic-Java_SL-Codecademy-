public class Store14 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store14(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  ///toString method
  
  public String toString(){
    //System.out.println("Store14");
    String x = "This Store14 sells " + productType + " at a price of " + price + ".";
    return x;
  }
  

  // main method
  public static void main(String[] args) {
    Store14 lemonadeStand = new Store14("Lemonade", 3.75);
    Store14 cookieShop = new Store14("Cookies", 5);

    System.out.println(lemonadeStand);
    System.out.println(cookieShop);



  }
}