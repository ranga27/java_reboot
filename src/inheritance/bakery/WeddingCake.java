package inheritance.bakery;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake() {
        //set default flavour calling the super constructor
        super("almond");}

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
