package miniprojects.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee{
    /*
    Part-Time Employees: Salary is calculated as hourly rate * hours worked.

    Part-time employees can only work between 1 and 40 hours per week.
    If more than 40 hours is entered, display a warning message: "Invalid number of hours entered!".


    common properties from super class (Employee) => name, id, salary
    specific properties required only for PartTimeEmployee =>

     */

    // specific properties required only for PartTimeEmployee
    private double hourlyRate;
    private double hoursWorked;



    // Constructor to initialise the values for PartTimeEmployee
    public PartTimeEmployee(String name, String id, double hourlyRate, double hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    // overriding calculateSalary() for specific implementation of PartTimeEmployee
    @Override
    public double calculateSalary() {
        // check if hours per week are valid or not
        if (hoursWorked < 1 || hoursWorked > 40){
            System.out.println("Invalid number of hours entered!");
            System.out.println("Number of hours worked: " + hoursWorked);
            return 0;
        }else {
            return hourlyRate * hoursWorked;
        }
    }


    @Override
    public String getDetails() {
        return "Part-Time Employee name: " + getName() + " , ID: "+ getId() + " , Total salary: " + calculateSalary();
    }
}
