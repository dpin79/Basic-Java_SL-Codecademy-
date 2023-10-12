public class Store1{
  //instances

  String name;
  int selledAmount;
  boolean open;

  //constructors
  public Store1(String currentName, int selledNumber, boolean Open){
    name = currentName;
    selledAmount = selledNumber;
    open = Open;

  }
  //main
  public static void main(String[]args){
    Store1 clothesShop = new Store1("Koaj",1000,true);

    Store1 lemonadeStore = new Store1("icyLemon",200,false);
     
    Store1 techStore = new Store1("Alkosto", 2000, true);
    /*
    System.out.println("\n");

    System.out.println("First shop named: " + clothesShop.name + " has selled " + clothesShop.selledAmount + " and if you wanna know it´s open, that is " + clothesShop.open);

    System.out.println("");
    System.out.println("Second shop named: " + lemonadeStore.name + " has selled " + lemonadeStore.selledAmount + " and if you wanna know it´s open, that is " + lemonadeStore.open);
  
    System.out.println("");
    System.out.println("Third shop named: " + techStore.name + " has selled " + techStore.selledAmount + " and if you wanna know it´s open, that is " + techStore.open);
    */
  }

}
