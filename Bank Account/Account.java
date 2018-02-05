public class Account {
   private int accountNumber;
   private int balance;
   
   public int getAccountNumber() {
      this.accountNumber = (int) ((Math.random() * 999999) + 100000);
      return this.accountNumber;
   }
   public void withdraw(int withdraw){
      this.balance = balance - withdraw;
   }
   
   public void deposit(int deposit) {
      this.balance = balance + deposit;
   }
   public String toString() {
      String str = "Checking account: " + this.accountNumber + ",    balance: $" + this.balance;
      return str;
   } 
}