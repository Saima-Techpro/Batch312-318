package day24oop_encapsulation;

public class StudentRunner {
    public static void main(String[] args) {



        Student student = new Student();
        System.out.println(student.getName());

        System.out.println(student.getAge());


        System.out.println(student.isSuccess());

        // Update the name of the student
        student.setName("Hary");

        // To se the change/update, we need to use getters
        System.out.println(student.getName());

        student.setAge(19);
        System.out.println(student.getAge()); // 19

        student.setSuccess(false);
        System.out.println(student.isSuccess()); // false


        // NOTE: setters DO NOT update the original data. The update happens for the object only
        Student student1 = new Student();
        System.out.println(student1.getName()); // Henry




    }
}
