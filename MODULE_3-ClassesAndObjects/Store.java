public class Store{
  //instances

  String name;
  int selledAmount;
  boolean open;

  //constructors
  public Store(String currentName, int selledNumber, boolean Open){
    name = currentName;
    selledAmount = selledNumber;
    open = Open;

  }
  //main
  public static void main(String[]args){
    Store clothesShop = new Store("Koaj",1000,true);

    Store lemonadeStore = new Store("icyLemon",200,false);

    Store techStore = new Store("Alkosto", 2000, true);
    
    System.out.println("\n");

    System.out.println("First shop named: " + clothesShop.name + " has selled " + clothesShop.selledAmount + " and if you wanna know it´s open, that is " + clothesShop.open);

    System.out.println("");
    System.out.println("Second shop named: " + lemonadeStore.name + " has selled " + lemonadeStore.selledAmount + " and if you wanna know it´s open, that is " + lemonadeStore.open);
  
    System.out.println("");
    System.out.println("Third shop named: " + techStore.name + " has selled " + techStore.selledAmount + " and if you wanna know it´s open, that is " + techStore.open);
  }

}
