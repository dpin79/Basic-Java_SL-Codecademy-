public class Store10 {
  // instance fields
  String productType;
  
  // constructor method
  public Store10(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store10 cookieShop = new Store10(cookie);
    
    cookieShop.advertise();
    
  }
}