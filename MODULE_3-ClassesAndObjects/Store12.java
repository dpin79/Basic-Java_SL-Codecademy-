public class Store12 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store12(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice=price + priceToAdd;
    
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store12 lemonadeStand = new Store12("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
  }
}