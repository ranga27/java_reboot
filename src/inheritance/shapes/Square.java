package inheritance.shapes;

public class Square extends Rectangle {
    //overriding a parent method
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
    //overloading a parent method
    public void print(String what){
        System.out.println("I am a " + what);
    }
}
