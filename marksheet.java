import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize arrays to store student details
        int[] sno = new int[3];
        String[] name = new String[3];
        double[][] marks = new double[3][5];
        double[] total = new double[3];
        double[] average = new double[3];

        // Input details for each student
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Student Number: ");
            sno[i] = input.nextInt();
            input.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            name[i] = input.nextLine();

            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextDouble();
                total[i] += marks[i][j];
            }
            
            average[i] = total[i] / 5.0;
        }

        // Print student details in a formatted table
        System.out.println("\nWelcome to Student Mark List Application");
        System.out.println("________________________________________________________________________________");
        System.out.println("SNo    Student Name    Sub1    Sub2    Sub3    Sub4    Sub5    Total    Average");
        System.out.println("________________________________________________________________________________");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-7d%-16s%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%n",
                    sno[i], name[i], marks[i][0], marks[i][1], marks[i][2], marks[i][3], marks[i][4], total[i], average[i]);
        }
        System.out.println("________________________________________________________________________________");

        // Close the scanner
        input.close();
    }
}

