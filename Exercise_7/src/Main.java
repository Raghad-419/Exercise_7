import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("1234567890","Raghad",2000);
        Account account2= new Account("1122334455" , "Lama",5000);
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.setBalance(2500);
        System.out.println(account1.getBalance());

        account2.transferTo(account1,1000);
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account2.credit(200);
        System.out.println(account2.toString());

        account2.debit(100);
        System.out.println(account2.toString());

    }
}