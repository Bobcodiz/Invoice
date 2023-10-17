import java.util.Scanner;


public class BookInputTest{
  public static void main(String[]args){
    Book book = new Book();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter the book title: ");
    book.title = scanner.nextLine();
    
    System.out.println("Please enter the author name:");
    book.author = scanner.nextLine();
    
    System.out.println("Please enter the number of pages:");
    book.numberOfPages = scanner.nextInt();

    System.out.println("The book title is  "+book.title);
    System.out.println("The book author is "+book.author);
    System.out.println("The book has "+book.numberOfPages+" pages.");

    scanner.close();
    }
    
}
