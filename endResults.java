 import java.util.*;
 public class endResults{
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
		//variable declaration
        String myname = "Mirowe Bob";
        String myRoll = "c026-01-0922/2022";
        int sem = 2;

		int score1,score2,score3,score4;
		String ucode1,ucode2,ucode3,ucode4;
		System.out.print("Enter Unit Code for Unit 1: ");
		ucode1= inp.nextLine();
		System.out.print("Enter Unit Code for Unit 2: ");
		ucode2= inp.nextLine();
		System.out.print("Enter Unit Code for Unit 3: ");
		ucode3= inp.nextLine();
		System.out.print("Enter Unit Code for Unit 4: ");
		ucode4= inp.nextLine();
		System.out.print("Enter Unit Score for Unit 1: ");
		score1= inp.nextInt();
		System.out.print("Enter Unit Score for Unit 2: ");
		score2= inp.nextInt();
		System.out.print("Enter Unit Score for Unit 3: ");
		score3= inp.nextInt();
		System.out.print("Enter Unit Score for Unit 4: ");
		score4= inp.nextInt();
		int sum = score1+score2+score3+score4;
		double avrg= (double) sum/4;
		char grade='D';
		if((avrg<=100)&&(avrg>=70)) {
			grade='A';
		}else if ((avrg<70)&&(avrg>=60)) {
			grade='B';
		}else if ((avrg<60)&&(avrg>=50)) {
			grade='C';
		}else if ((avrg<50)&&(avrg>=40)) {
			grade='D';
		}else if (avrg<40) {
			grade='F';
		}
		System.out.print("\n\n");
		//output
		System.out.println("                                      Department of Computer Science");
		System.out.println("                                           End Semester Results");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Name: "+myname+"               |Roll_No: "+myRoll+"               Semester: "+sem);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Unit Code                          |Unit Name:                               Score");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|"+ucode1+"                            |Database                                |"+score1+"\n");
		System.out.println("|"+ucode2+"                            |Systems                                 |"+score2+"\n");
		System.out.println("|"+ucode3+"                            |Algorithm                               |"+score3+"\n");
		System.out.println("|"+ucode4+"                            |Statistics                              |"+score4);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Total                                                                       |"+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Average                                                                     |"+avrg);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Grade                                                                       |"+grade);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Recommendation                                                              |Recommend Pass");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Grading Criteria                                            Overall Grade(A-D)");
		System.out.println("70-100         A");
		System.out.println("60-70          B");
		System.out.println("50-60          C");
		System.out.println("40-50          D");
		System.out.println("Below 40       F");
		System.out.println("-------------------------------------------------------------------------------------------------");

        inp.close();
    }
}