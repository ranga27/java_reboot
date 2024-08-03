package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal masha = new Dog();
        masha.makeSound();

        masha = new Cat();
        masha.makeSound();
    }
}
