package ca.aagavin.aaron.objects;

/*
 * Created by Aaron
 */

public class MenuItem {

    private String name;

    private double price;

    private int image;

    private String Description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public MenuItem(String name, double price, int image, String description) {
        this.name = name;
        this.price = price;
        this.image = image;
        Description = description;
    }
}