public class SavingsAccount15 {
  
  int balance;
  
  public SavingsAccount15(int initialBalance){
    balance = initialBalance;
  }
  
  //check balance method
  public void checkBalance(){
    System.out.println("Hello!\nYour balance is " + balance);
  }

  //deposit method
  public void deposit(int amountToDeposit){
    
    balance = balance + amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);

  }

  //withdraw method
  public void withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
  }


  //toString

  public String toString(){
    String x = "The current balance is: " + balance;
    return x;
  }

  public static void main(String[] args){
    SavingsAccount15 savings = new SavingsAccount15(2000);
    

    //Check balance:
    System.out.println("Hello!");
    savings.checkBalance();
    
    //Withdrawing:
    System.out.println("Withdraw test\nThe withdraw is: ");
    savings.withdraw(300);
    //toStringTST
    savings.toString();
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    System.out.println("The deposit test:");
    savings.deposit(600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}
