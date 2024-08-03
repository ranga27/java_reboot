package inheritance.bakery;

public class Cake {

    private String flavour;
    private double price;

    //set default values via the constructor
    public Cake() {
        //calls the constructor for this class that matched the parameter data type
        this("vanilla");
    }
    //constructor to set the default flavour
    public Cake(String flavour) {
        setFlavour(flavour);
        setPrice(9.99);
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public double getPrice() {
        return price;
    }
}
