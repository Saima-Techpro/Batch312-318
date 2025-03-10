package practices.day06.encapsulation;

public class Student {
    //TASK:
    //Create fields with correct access modifiers: firstName, lastName, age.
    //Create empty and parameterized constructors.
    //Create toString override.

    //private, protected, default, public
    private String firstName;
    private String lastName;
    private Integer age;

    //Alt+Insert for Generate menu

    public Student() {
    }

    public Student(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0){
            System.out.println("The age must be a positive integer!");
        }else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
