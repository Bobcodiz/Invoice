public class BankAccount {
    int acNo;
    String acName,acPhone,acEmail;
    double acBalance;

    public BankAccount(int acNo,String acEmail,String acName, String acPhone,double acBalance) {
        this.acBalance = acBalance;
        this.acEmail = acEmail;
        this.acName = acName;
        this.acNo = acNo;
        this.acPhone = acPhone;
    }



    public void accountHolder(){
        System.out.println("Account Number: "+acNo);
        System.out.println("Account Holder Name: "+acName);
        System.out.println("Account Holder Address:"+acPhone);
        System.out.println("Account Holder Phone is: "+acEmail);
        System.out.println("Account Holder Balance: "+acBalance);
    }
    public void deposit(double amount){
        acBalance += amount;
    }
    public void displayBalance(){
        System.out.println("Account number "+acNo+" has account balance of "+acBalance);
    }
}
