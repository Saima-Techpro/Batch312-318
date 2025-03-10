package practices.day06.encapsulation;

public class Run {
    public static void main(String[] args) {
        //TASK
        //Create a student with this information: Bob Smith, 25 and print the student.
        //Change his age to 26.
        //Create a student with empty constructor.
        //Assign these values: Mike, Olsen, 24
        //Change his age to -5
        //Edit the setAge method so it does not allow negative values.
        //HW: Censor the first and last names so that the first characters are visible, the rest are asterisks. *
        //Make sure the getFirstName and getLastName works in this way.

        Student student = new Student("Bob", "Smith", 25);
        System.out.println(student);
        student.setAge(26);
        System.out.println(student);

        Student student1 = new Student();
        System.out.println(student1); //all fields are null

        student1.setFirstName("Mike");
        student1.setLastName("Olsen");
        student1.setAge(24);
        System.out.println(student1);
        student1.setAge(-5);
        System.out.println(student1);
    }
}
