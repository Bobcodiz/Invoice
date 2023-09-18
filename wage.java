import java.util.Scanner;

 class Bob {
    public static void main(String[] args) {
        System.out.println("Wage calculator");
        System.out.println("---------------\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Registration number: ");
        String regNo = scanner.nextLine();

        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();

        double totalWage = rate * hours;

        System.out.println("\n" + regNo);
        System.out.println("wage Details:");
        System.out.println("Hourly pay rate:           " + rate);
        System.out.println("Hours worked:              " + hours);
        System.out.println("Total wages:               " + totalWage);

        
        scanner.close();
    }
}
