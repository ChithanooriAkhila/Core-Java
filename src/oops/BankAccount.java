package oops;

public class BankAccount {
    private final String owner;
    private int balance;
    BankAccount(String owner){
       this(owner,0);
    }
    BankAccount(String owner,int balance){
        this.owner=owner;
        if(balance<=0) {
            deposit(balance);
        }
        else{
            this.balance=balance;
        }
    }
    public void deposit(int amount){
        if(balance<=0) {
            System.out.println("invalid amount");
        }
        else{
            balance+=amount;
        }
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance) {
            balance -= amount;
        }
        else if(amount<=0){
            System.out.println("amount should be greater than zero");
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
}
