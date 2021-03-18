package cz.muni.fi.pa165;

public class Product {

    public Product() {
    }

    public Product(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + '}';
    }

}
