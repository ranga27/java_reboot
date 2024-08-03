package inheritance.bakery;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavour());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavour());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavour("pina colada");
        weddingCake.setPrice(350);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavour());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }
}

