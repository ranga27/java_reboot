package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal masha = new Dog();
        masha.makeSound();

        masha = new Cat();
        masha.makeSound();
        ((Cat)masha).scratch();
        feed(masha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here's your dog food");
        }
        else if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }

    }
}
