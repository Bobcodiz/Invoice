import java.util.Scanner;
public class payroll {
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Employee number:");
        String empno = scanner.nextLine();

        System.out.println("Enter Employee names:");
        String empName = scanner.nextLine();

        System.out.println("Enter Employee designation:");
        String desgnation = scanner.nextLine();

        System.out.println("Enter number of days worked:");
        int days = scanner.nextInt();

        System.out.println("Enter the pay rate:");
        int payRate = scanner.nextInt();

        System.out.println("Enter the generation date:");
        String genDate = scanner.nextLine();
        
        System.out.flush();
        
        int basicPay = days * payRate;
        int pf = basicPay / 10;
        int profTax = (20/100) * basicPay; 
        int grossEarn = basicPay;
        int totalDeduct = pf + profTax;
        int netPay = basicPay - totalDeduct;
        
        System.out.flush();
        System.out.println("ENTER EMPLOYEE NO TO GENERATE PAYSLIP:" );
        int EmployeeNo = scanner.nextInt();

        System.out.println();
        System.out.println("                    SHRI KRISHNA CHEMIST AND DRUGGIST               ");
        System.out.println("                           SALARY MONTH 9 2013                      ");
        System.out.println();

        System.out.println("EMP.NO.:"+empno+"          EMP.NAME:"+empName+"        DESIGNATION:"+desgnation);
        System.out.println("DAYS WORKED:"+days+"     PAY RATE:"+payRate+"       GEN.DATE:"+genDate);
        System.out.println("____________________________________________________________________");
        System.out.println("EARNINGS           AMOUNT(RS.)         DEDUCTIONS        AMOUNT(RS.)");
        System.out.println("____________________________________________________________________");
        System.out.println("BASIC PAY          "+basicPay+"            P.F.:"+pf);
        System.out.println("                                       PROF.TAX:"+profTax);
        System.out.println();
        System.out.println("____________________________________________________________________");

        System.out.println("GROSS EARN.       "+grossEarn+"        TOTAL DEDUCT      "+totalDeduct);
        System.out.println("                                       NET PAY           "+netPay);
        System.out.println("_____________________________________________________________________");
        System.out.println();
        scanner.close();
    }
    
}
