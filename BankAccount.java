
//this declares a class named "bankaccount"
public class BankAccount {
//instance variables. these are the private member variables that store information about a bank account,    
    private String name;
    private int age;
    private String accountNumber;
    private double balance;
// our constructor method that initializes a 'bankaccount' object with the provided values for ' name', 'age,'. 'accountNumber'.and ' balance'.
    
    public BankAccount(String name, int age, String accountNumber, double balance) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
// atuang deposit METHOD. allow us to deposite a specified "amount" into the accounts balance.
    //iya sang e check kn ang deposite ammount is greater than 0 before ma update ang balance.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("SUCCESSFULY DEPOSIT"); 
            System.out.println ("your Current balance is: " + balance);
        } else {
            System.out.println("amount deposit Invalid.");
        }
    }
    //returns the current balance of the account.
    public double sum(){
        return balance;
    }
//this method e print nya ang account summary,account holders name,age,account number, and balance.
    public void AccSummary() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
//   public static void main(String[] args) mao ni ang method nga pag entry sa  atung program.
    //It creates an instance of BankAccount named commisionAccount with initial values.
    
  /*tawagon ang;
/*1.deposit method twice on commisionAccount to simulate two deposits.
/*2.AccSummary method to print the account summary.
*3.sum method to print the balance.
*/
    public static void main(String[] args) {
        BankAccount commisionAccount = new BankAccount("jemjem", 20, "777888999", 1000.0);
        commisionAccount.deposit(500.0);
        commisionAccount.deposit(200.0);
        commisionAccount.AccSummary();
        System.out.println("balance:"+ commisionAccount.sum());
    }
}