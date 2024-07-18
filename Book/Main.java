package Book;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Libro harryPotter = new Libro("Harry Potter", "J.K Rowling", false, new Date());

        String title = harryPotter.getTitle();

        System.out.println(title);

        harryPotter.borrowed();
        System.out.println(harryPotter.getIsBorrowed()?"THE BOOK IS BORROWED":"THE BOOK IS AVAILABLE FOR BORROWING");
        
        System.out.println(harryPotter.getIsBorrowed()?"THE BOOK IS BORROWED":"THE BOOK IS AVAILABLE FOR BORROWING");
    }
}
