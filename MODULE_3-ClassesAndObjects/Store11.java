public class Store11 {
  // instance fields
  String productType;
  
  // constructor method
  public Store11(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  // greet method
  public void greetCustomer(String customer){
    System.out.println("Welcome to the store, " + customer + "!");
  }
  // main method
  public static void main(String[] args) {
    Store11 lemonadeStand = new Store11("Lemonade");
    
    lemonadeStand.greetCustomer("Ejemplo");
  }
}