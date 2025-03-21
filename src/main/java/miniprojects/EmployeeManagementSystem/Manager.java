package miniprojects.EmployeeManagementSystem;

public class Manager extends FullTimeEmployee{
    /*
    Managers: Inherit from Full-Time Employees, with additional managerial perks.
    Managerial Bonus: Managers receive an additional 10% bonus on top of their full-time salary.

    Multi-level Inheritance
    common properties from super class (FullTimeEmployee) => name, id, salary
    specific properties required only for Manager => none because they're already present in syper class

     */

    public Manager(String name, String id, double salary, double bonus, double benefits){
        super(name, id, salary, bonus, benefits);
    }

    /*
    In  Multi-level Inheritance, at least ONE of the subclasses MUST implement abstract methods.
    In this case:
    Employee is abstract = grandparent
    FullTimeEmployee is a concrete subclass = parent (has already implemented the abstracts methods inherited from Employee)
    Manager is a concrete subclass = child class (so implementation of those abstract methods is OPTIONAL for this child class

     */

    @Override
    public double calculateSalary() {
        // need to add bonus which is equal to 10% of their full-time salary
        return super.calculateSalary() * 1.1;
    }

    @Override
    public String getDetails() {
        System.out.println(getName() + " is managing the team.");
        return "Manager's name: " + getName() + " , ID: "+ getId() + " , Total salary: " + calculateSalary();
    }
}
