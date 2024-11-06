import java.util.Scanner;       
import java.util.ArrayList;

public class Menu {

    public static void main(String [] args){


        ArrayList<Books> books = new ArrayList<Books>();
        Scanner sc = new Scanner(System.in);  

        System.out.println("Welcome to the Library Management System!");
        System.out.println("Pick an option by writing the number.");
        
        System.out.println();

        while (true){
        System.out.println("1. Add book");
        System.out.println("2. Delete book");
        System.out.println("3. Modify book title ");
        System.out.println("4. List all books");
        System.out.println("5. Search book");
        System.out.println("6. Exit program");

        String choice = "";
        int options;
        System.out.print("Pick an option: ");
        options = sc.nextInt(); 
        
            switch(options){
                case 1: 
                    choice = "Add book";
                    AddBooks.addBook(books);
                break;
                case 2:
                    choice = "Delete book";
                    System.out.println("Available IDs to delete:");
                    for (Books book : books){
                        System.out.println(book.getID() + ": " + book.getTitle());
                    }
                    System.out.println("Enter the ID of the book to delete: ");
                    int id = sc.nextInt();
                    DeleteBooks.deleteBook(books, id);
                break;
                case 3:
                    choice = "Modify book title";
                    if (books.size() == 0) {
                        System.out.println("There is no book in the list to modify. First add a book.");
                    } else {
                    System.out.println("\n========================= \nAvailable IDs to modify: \n=========================");
                    for (Books book : books){
                        System.out.println(book.getID() + ": " + book.getTitle());
                    }
                    System.out.println("Enter the ID of the book to modify: ");
                    int modifyID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the new title for the book: ");
                    String newTitle = sc.nextLine();
                    ModifyBooks.modifyBookTitle(books, modifyID, newTitle);
                    }
                break;
                case 4:
                    choice = "List all books";
                    sc.nextLine();
                    System.out.println("What would you like to sort by? Author, Title, or Year? ");
                    String sortBy = sc.nextLine().toLowerCase();
                    ListBooks.listBooks(books, sortBy);
                break;
                case 5:
                    choice = "Search book";
                    SearchBooks.searchBooks(books);
                break;
                case 6: 
                    choice = "Exit program";
                break;
                default:
                System.out.println("Not valid option. Pick again.");
                }
                if (options == 6){
                System.out.println("Closing program...");
                System.exit(options);
                sc.close();
                }
                
            }
            
                
    }
} 