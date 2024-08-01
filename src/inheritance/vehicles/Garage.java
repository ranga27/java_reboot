package inheritance.vehicles;

public class Garage {

    public static void main(String[] args) {

        Coupe myCar = new Coupe();
        //Inherits from grandparent class vehicle
        myCar.setColor("red");
        //Gets doors via child class coupe
        System.out.println(
                String.format("My car is %s and has %d doors.",
                        myCar.getColor(), myCar.getDoors())
        );
    }
}