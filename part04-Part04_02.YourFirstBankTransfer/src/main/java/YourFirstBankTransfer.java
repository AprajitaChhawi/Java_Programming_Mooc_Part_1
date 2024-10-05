
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account math_account = new Account("Matthews account",1000.00);
        Account my_account = new Account("My account",0.00);
        math_account.withdrawal(100.00);
        my_account.deposit(100.00);
        System.out.println(math_account);
        System.out.println(my_account);
    }
}
