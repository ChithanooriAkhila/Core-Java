package oops;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("akhila",10000);
        BankAccount sAccount =new BankAccount("Bob",2000);
        sAccount.deposit(500);
        System.out.println("owner: "+sAccount.getOwner());
        System.out.println("balance: "+sAccount.getBalance());
        sAccount.withdraw(3000);
    }
}
