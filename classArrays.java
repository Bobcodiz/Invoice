import java.util.*;
public class classArrays {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] roll = new int[4];
        String[] name = new String[4];
        double[][] marks = new double[4][3];
        double[] total = new double[4];
        double[] average = new double[4];
        String[] results = new String[4];
        String[] grade = new String[4];

        System.out.println("Hello bob");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter The roll Number for Student " + (i + 1) + " : ");
            roll[i] = scanner.nextInt();

            System.out.print("\nEnter the Name for Student: ");
            name[i] = scanner.next();

            System.out.print("\nEnter The three marks: ");

        
            for (int k = 0;k <= 2;k++){
                marks[i][k] = scanner.nextDouble();
            }

            total[i] = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.println("The total is: "+total[i]);

            average[i] = total[i] / 3.0;
            if (average[i] > 50) {
                results[i] = "P";
            } else {
                results[i] = "F";
            }

            if (average[i] >= 70 && average[i] <= 100) {
                grade[i] = "A";
            } else if (average[i] >= 50) {
                grade[i] = "B";
            } else if (average[i] >= 0 && average[i] < 50) {
                grade[i] = "C";
            } else {
                System.out.println("Enter a valid mark!");
            }
        }

        System.out.println("***********************************************************************************************************************************");
        System.out.println("\t\t\t\t\t\tStudent Marklist\t\t\t\t\t\t\t");
        System.out.println("***********************************************************************************************************************************");
        System.out.println("Roll\t\tName\t\tMark1\t\tMark2\t\tMark3\t\tTotal\t\tResults\t\tAverage\t\tGrade");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\n%d\t\t%s\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%s\t\t%.1f\t\t%s\n",
                    roll[i],
                    name[i],
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    total[i],
                    results[i],
                    average[i],
                    grade[i]);
        }
        scanner.close();
    }
}

     
