package name;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Cart cart = new Cart();

        // Adding books to the library
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        library.addBook(book1);
        library.addBook(book2);

        // Displaying all books in the library
        System.out.println("All books in the library:");
        library.displayBooks();

        // Adding books directly to the cart
        Book cartBook1 = library.getBookByTitle("The Catcher in the Rye");
        Book cartBook2 = library.getBookByTitle("To Kill a Mockingbird");

        if (cartBook1 != null) {
            cart.addItem(cartBook1);
        }

        if (cartBook2 != null) {
            cart.addItem(cartBook2);
        }

        // Displaying books in the cart
        System.out.println("\nBooks in the cart:");
        cart.displayCart();

        // Displaying remaining books in the library
        System.out.println("\nRemaining books in the library:");
        library.displayBooks();

    }
}
