package inheritance.access;

public class SuperClass {

    public int publicField;
    protected int protectedField;
    int defaultField; // package-private
    private int privateField;

    public void publicMethod() {
        System.out.println("Public method in superclass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in superclass");
    }

    void defaultMethod() {
        System.out.println("Default method in superclass");
    }

    private void privateMethod() {
        System.out.println("Private method in superclass");
    }

    public SuperClass() {
        System.out.println("Constructor of superclass");
    }
}
