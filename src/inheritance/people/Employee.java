package inheritance.people;

public class Employee extends Person {
    private String employeeId;
    private String title;

    public Employee(){
        //super(base) class constructor with args needs to be called else compile error
        super("John Doe");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
