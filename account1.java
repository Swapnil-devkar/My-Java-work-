class account1 {
   // Private fields
   private String accountNumber;
   private double balance;

   // Constructor
   public account1(String accountNumber) {
      this.accountNumber = accountNumber;
      this.balance = 0.0; // Initial balance
   }

   // Getter for account number
   public String getAccountNumber() {

      return accountNumber;
   }

   // Getter for balance
   public double getBalance() {
      return balance;
   }

   // Method to deposit money
   public void deposit(double amount) {
      if (amount > 0) {
         balance += amount;
      } else {
         System.out.println("Deposit amount must be positive.");
      }
   }

   // Method to withdraw money
   public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
         balance -= amount;
      } else {
         System.out.println("Insufficient balance or invalidamount.");
      }
   }

   public static void main(String[] args) {
    account1 myAccount = new account1("123456789");
    myAccount.deposit(1000); // Deposit money
    System.out.println("Balance: " + myAccount.getBalance()); //
    
    myAccount.withdraw(500); // Withdraw money
    System.out.println("Balance after withdrawal:" + myAccount.getBalance());
   
    myAccount.withdraw(600);
    // Attempt to

    }
}