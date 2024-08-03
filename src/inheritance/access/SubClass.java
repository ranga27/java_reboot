package inheritance.access;

public class SubClass extends SuperClass {
    public SubClass() {
        super(); // Call to superclass constructor
    }

    @Override
    public void publicMethod() {
        super.publicMethod(); // Optionally call the superclass method
        System.out.println("Overridden public method in subclass");
    }

    public void useInheritedFieldsAndMethods() {
        publicField = 10; // Accessible
        protectedField = 20; // Accessible
        defaultField = 30; // Accessible (if in the same package)
        // privateField = 40; // Not accessible

        publicMethod(); // Accessible
        protectedMethod(); // Accessible
        defaultMethod(); // Accessible (if in the same package)
        // privateMethod(); // Not accessible
    }
}
