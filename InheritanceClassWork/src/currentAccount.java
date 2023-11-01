import java.util.Scanner;

public class currentAccount  extends BankAccount{


    public currentAccount(int acNo, String acEmail, String acName, String acPhone, double acBalance) {
        super(acNo, acEmail, acName, acPhone, acBalance);

    }
    Scanner scanner = new Scanner(System.in);
    public double getBalance(){
        System.out.println("Enter Amount to deposit:");
        return scanner.nextDouble();

    }



}
