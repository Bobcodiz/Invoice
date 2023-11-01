public class Account {
    public static void main(String[] args) {
        System.out.println("SAVINGS ACCOUNT DETAILS");
        SavingAccount sac = new SavingAccount(2002,"mirowebob@gmail.com","Mirowe Bob","0723908976",1000);
        sac.accountHolder();
        sac.deposit(500);
        sac.displayBalance();
        System.out.println();
        System.out.println();
        System.out.println("CURRENT ACCOUNT");

        currentAccount curr = new currentAccount(6756,"emilykip@gamil.com","Emily Kipchoge","0784563829",1000);
        curr.deposit(curr.getBalance());
        curr.accountHolder();
        curr.displayBalance();
    }
}