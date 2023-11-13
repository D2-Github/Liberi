package name;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Book book) {
        cartItems.add(book);
    }

    public void displayCart() {
        for (Book item : cartItems) {
            System.out.println(item);
        }
    }
}
