package miniprojects.EmployeeManagementSystem;

public class ContractEmployee extends Employee{
    /*
    Contract Employees: Are paid based on contract rate and contract length.

    Contract employees can have contracts of up to 24 months.
    If the contract length exceeds 24 months, display a warning: "Invalid contract length!".

    common properties from super class (Employee) => name, id, salary
    specific properties required only for ContractEmployee => contract rate and contract length

     */

    private double contractRate;
    private int contractLength;

    // Constructor
    public ContractEmployee(String name, String id, double contractRate, int contractLength){
        super(name, id);
        this.contractRate = contractRate;
        this.contractLength = contractLength;

    }

    @Override
    public double calculateSalary() {
        if (contractLength < 0 || contractLength > 24){
            System.out.println("Invalid contract length");
            return 0;
        }else {
            return contractRate * contractLength; // salary = contractRate * contractLength
        }
    }


    @Override
    public String getDetails() {
        return "Contract Employee name: " + getName() + " , ID: "+ getId() + " , Total salary: " + calculateSalary();
    }
}
