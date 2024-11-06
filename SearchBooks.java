import java.util.ArrayList;
import java.util.Scanner;

public class SearchBooks {
    public static void searchBooks(ArrayList<Books> books, Scanner sc){
        while (true) {
            System.out.println("Enter the book information (title, author or year): ");
            String identifier = sc.nextLine().toLowerCase();

            ArrayList<Books> bookMatches = new ArrayList<Books>();
            for (Books book : books){
                if (book.getTitle().toLowerCase().contains(identifier) ||
                    book.getAuthor().toLowerCase().contains(identifier) ||
                    String.valueOf(book.getYear()).contains(identifier)) {
                        bookMatches.add(book);
                }
            }

            if (bookMatches.isEmpty()){
                System.out.println("No matching books.");
            } else {
                System.out.println("\nMatched books found: \n");
                for (Books book : bookMatches){
                    System.out.println("ID: " + book.getID() + "\nTitle: '" + book.getTitle() + "'\nAuthor: " + book.getAuthor() + "\nYear: " + book.getYear() + "\n");
                }
            }
            break;  // Exit after one search query
        }
    }
}
