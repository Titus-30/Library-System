import java.util.Scanner;

// Lendable Interface with methods to borrow and return items
interface Lendable {
    void borrowItem();
    void returnItem();
}

// DigitalAccess Interface for online reading for digital items
interface DigitalAccess {
    void onlineRead();
}

// Abstract LibraryItem class with common properties for all items
abstract class LibraryItem1 {
    private String title;
    private String author;
    private String itemId;

    public LibraryItem1(String title, String author, String itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
    }

    // Encapsulation with Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemId() {
        return itemId;
    }

    // Abstract method to display item details
    public abstract void displayItemDetails();
}

// Book class that extends LibraryItem1 and implements Lendable
class Book1 extends LibraryItem1 implements Lendable {

    public Book1(String title, String author, String itemId) {
        super(title, author, itemId);
    }

    @Override
    public void borrowItem() {
        System.out.println("You have borrowed the book: " + getTitle());
    }

    @Override
    public void returnItem() {
        System.out.println("You have returned the book: " + getTitle());
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Book: " + getTitle() + ", Author: " + getAuthor() + ", ID: " + getItemId());
    }
}

// Magazine class that extends LibraryItem1 and implements Lendable
class Magazine extends LibraryItem1 implements Lendable {

    public Magazine(String title, String author, String itemId) {
        super(title, author, itemId);
    }

    @Override
    public void borrowItem() {
        System.out.println("You have borrowed the magazine: " + getTitle());
    }

    @Override
    public void returnItem() {
        System.out.println("You have returned the magazine: " + getTitle());
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Magazine: " + getTitle() + ", Author: " + getAuthor() + ", ID: " + getItemId());
    }
}

// DVD class that extends LibraryItem1 and implements Lendable
class DVD1 extends LibraryItem1 implements Lendable {

    public DVD1(String title, String author, String itemId) {
        super(title, author, itemId);
    }

    @Override
    public void borrowItem() {
        System.out.println("You have borrowed the DVD: " + getTitle());
    }

    @Override
    public void returnItem() {
        System.out.println("You have returned the DVD: " + getTitle());
    }

    @Override
    public void displayItemDetails() {
        System.out.println("DVD: " + getTitle() + ", Director: " + getAuthor() + ", ID: " + getItemId());
    }
}

// DigitalBook class extends Book1 and implements DigitalAccess
class DigitalBook extends Book1 implements DigitalAccess {

    public DigitalBook(String title, String author, String itemId) {
        super(title, author, itemId);
    }

    @Override
    public void onlineRead() {
        System.out.println("Reading the digital version of the book: " + getTitle());
    }
}

// Main Class to demonstrate the library system with user input
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for item type (Book, Magazine, DVD, DigitalBook)
        System.out.print("Enter item type (Book/Magazine/DVD/DigitalBook): ");
        String itemType = scanner.nextLine().trim();

        // Ask user for common properties (title, author, item ID)
        System.out.print("Enter Title: ");
        String title = scanner.nextLine().trim();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine().trim();

        System.out.print("Enter Item ID: ");
        String itemId = scanner.nextLine().trim();

        LibraryItem1 libraryItem = null;

        // Based on user input, create the appropriate item type
        switch (itemType.toLowerCase()) {
            case "book":
                libraryItem = new Book1(title, author, itemId);
                break;
            case "magazine":
                libraryItem = new Magazine(title, author, itemId);
                break;
            case "dvd":
                libraryItem = new DVD1(title, author, itemId);
                break;
            case "digitalbook":
                libraryItem = new DigitalBook(title, author, itemId);
                break;
            default:
                System.out.println("Invalid item type!");
                System.exit(1);
        }

        // Display the item details
        libraryItem.displayItemDetails();

        // Check if the item is Lendable
        if (libraryItem instanceof Lendable) {
            Lendable lendableItem = (Lendable) libraryItem;
            lendableItem.borrowItem();
            lendableItem.returnItem();
        }

        // If it's a digital book, allow online reading
        if (libraryItem instanceof DigitalAccess) {
            ((DigitalAccess) libraryItem).onlineRead();
        }

        scanner.close();
    }
}
