
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("Bank Account", 100.0);
        // Do not touch the code in Account.java
        // Write your program here
        account.deposit(20);
        System.out.println(account);
    }
}
