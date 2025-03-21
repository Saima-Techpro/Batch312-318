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
