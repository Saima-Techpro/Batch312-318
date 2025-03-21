package miniprojects.EmployeeManagementSystem;

public class Runner {
    public static void main(String[] args) {

        // Employee employee = new Employee(); // abstract class does NOT allow object creation

        // FullTimeEmployee

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Ali", "Avx123", 5000, 100, 50);
        System.out.println(fullTimeEmployee.getName());
        System.out.println(fullTimeEmployee.getId());
        System.out.println(fullTimeEmployee.calculateSalary());

        System.out.println(fullTimeEmployee.getDetails());

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Emily", "Ez567", 4500, 100, 60);
        System.out.println(fullTimeEmployee1.getDetails());

        // PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", "Bmx987", 11.50, 30);
        System.out.println(partTimeEmployee.getName());
        System.out.println(partTimeEmployee.getId());
        System.out.println(partTimeEmployee.calculateSalary());
        System.out.println(partTimeEmployee.getDetails());


        // Manger
        Manager manager = new Manager("Fatma", "Fwd421", 6000, 200, 100);
        System.out.println(manager.getDetails());


        // Contract Employee
        ContractEmployee contractEmployee = new ContractEmployee("Avom", "Avc691", 10000, 6);
        System.out.println(contractEmployee.getDetails());


        // Intern
        Intern intern = new Intern("David", "Dgh120", 700, 3);
        System.out.println(intern.getDetails());

        Intern intern1 = new Intern("Eva", "Emn260", 700, 14);
        System.out.println(intern1.getDetails());
        System.out.println(intern1.calculateSalary());

    }
}
