package miniprojects.EmployeeManagementSystem;

public class Intern extends Employee {

    /*
    Interns: Receive a fixed stipend.

    Interns can only have a maximum internship period of 12 months.
    If more than 12 months is entered, display a warning message: "Invalid internship duration!".


    common properties from super class (Employee) => name, id, salary
    specific properties required only for Intern => stipend , duration
     */

    private double stipend;
    private int duration;

    // Constructor
    public Intern(String name, String id, double stipend, int duration){
        super(name, id);
        this.stipend = stipend;
        this.duration = duration;

    }

    @Override
    public double calculateSalary() {
       // check the maximum internship duration is 12 months or not
        if (duration< 1 || duration > 12){
            System.out.println("Invalid internship duration!");
            System.out.println("Number of months worked: "+ duration);
            return 0;
        }else {
            return stipend;
        }
    }

    @Override
    public String getDetails() {
        return "Intern name: " + getName() + " , ID: "+ getId() + " , Total salary: " + calculateSalary();
    }
}
