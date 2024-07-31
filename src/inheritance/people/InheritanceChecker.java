package inheritance.people;

public class InheritanceChecker {

    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        employee.setName("Sarang");
        System.out.println(employee.getName());
    }
}
