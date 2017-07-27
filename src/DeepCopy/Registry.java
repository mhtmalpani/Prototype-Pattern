package DeepCopy;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    /**
     * Placeholders for all the known items that can be referenced for any object creation
     */
    public enum itemName {
        Movie, Book
    }

    /**
     * Stores the list of all the Items and the default names to find the single instance of it
     */
    private Map<String, Item> itemsPrototype = new HashMap<>();


    public Registry() {
        loadItems();
    }

    /**
     *
     * @param type The type of Object required
     * @return The object cloned instance
     */

    public Item createItem (String type) {

        Item item = null;

        try {
            item = (Item) itemsPrototype.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    /**
     * Create a single default instance of all the known items possible
     */

    private void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(25);
        movie.setUrl("www.movie.com/basicMovie");
        movie.setRuntime("2 hours");
        itemsPrototype.put(itemName.Movie.toString(), movie);

        Book book = new Book();
        book.setTitle("Basic book");
        book.setPrice(25);
        book.setUrl("www.book.com/basicbook");
        book.setNumberOfPages(100);
        itemsPrototype.put(itemName.Book.toString(), book);
    }
}
