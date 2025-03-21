package miniprojects.EmployeeManagementSystem;

public class FullTimeEmployee extends Employee{
    /*
    Full-Time Employees: Salary is calculated as base salary + bonus + benefits.
    name, id, salary => inherited from the parent Employee class
     */

    // variables that are specific toFull-Time Employees
    private double bonus;
    private double benefits;

    // Parameterised constructor to initialise values for FullTimeEmployee
    public FullTimeEmployee(String name, String id, double salary, double bonus, double benefits){
        super(name, id); // call to super constructor to provide values of name and id
        this.salary = salary; // this.salary refers to the salary variable inherited from super class (Employee)
        this.bonus = bonus;
        this.benefits = benefits;
    }
    /*
    In Java, the FullTimeEmployee class inherits from the Employee class.
    The Employee class has a protected double salary attribute. Since FullTimeEmployee is a subclass of Employee,
    it inherits this salary field from the parent class.

     This means that even though FullTimeEmployee does not declare a salary variable explicitly, it has access to
     the salary field through inheritance.
     this.salary refers to the inherited salary:

     The 'this' keyword in Java refers to the current instance of the class (in this case, an instance of FullTimeEmployee).
     Since FullTimeEmployee inherits the salary field from Employee, this.salary is a reference to the salary field
     in the Employee class, not in FullTimeEmployee itself.
     The assignment this.salary = salary; ensures that the salary field inherited from Employee gets initialized
     with the value passed into the FullTimeEmployee constructor.
     */

    // override the abstract methods from Employee Superclass
    @Override
    public double calculateSalary() {
        return salary+bonus+benefits;
    }

    @Override
    public String getDetails() {
        return "Full-Time Employee name: " + getName() + " , ID: "+ getId() + " , Total salary: " + calculateSalary();
    }
}
