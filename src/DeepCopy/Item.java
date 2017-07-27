package DeepCopy;

/**
 * Abstract needed to avoid instantiation of this class
 * Cloneable shall be propagated to all the Classes that extend this Item class
 */
public abstract class Item implements Cloneable {

    private String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
