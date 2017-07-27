package DeepCopy;

/**
 * Lightweight Construction of Items
 * Avoids the use of NEW
 * 1000 objects of the same Class need not be created.
 * Just one instance will work that can be cloned
 */

public class PrototypeMain {

    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem(Registry.itemName.Movie.toString());
        movie.setTitle("Star Wars");
        
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());
        System.out.println(movie.getRuntime());


        Book book = (Book) registry.createItem(Registry.itemName.Book.toString());
        book.setTitle("The Alchemist");
        book.setNumberOfPages(380);
        
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        System.out.println(book.getUrl());
        System.out.println(book.getNumberOfPages());
    }
}
