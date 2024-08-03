package inheritance.bakery;

public class BirthdayCake extends Cake {

    private int candles;
    //use the default constructor to set the flavour
    public BirthdayCake() {
        //set default flavour by calling the super constructor
        super("chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
