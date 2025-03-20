package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

     // Create course objects

     Course javaCourseEn = new Course("Java_Eng", "Autumn", 75, 98);
     Course javaCourseTr = new Course("Java_Tr", "Winter", 115, 95);
     Course dataSciCourseEn = new Course("DataScience_Eng", "Spring", 95, 94);
     Course dataSciCourseTr = new Course("DataScience_Tr", "Summer", 135, 92);

     System.out.println("javaCourseEn = " + javaCourseEn);

     // What's pre-requisite to use LAMBDA expressions?
     // Collections (List) or Arrays


        List<Course> courseList = new ArrayList<>();

        courseList.add(javaCourseEn);
        courseList.add(javaCourseTr);
        courseList.add(dataSciCourseEn);
        courseList.add(dataSciCourseTr);

        System.out.println("courseList = " + courseList);


        // Check if all agvScore is greater than 90
        boolean checkAvgScore = courseList.stream().allMatch(t -> t.getAvgScore() > 90);
        System.out.println("checkAvgScore = " + checkAvgScore); // true


        // Check if all course have more than 100 students
        boolean checkNumOfStu = courseList.stream().allMatch(t-> t.getNumOfStudents() > 100);
        System.out.println("checkNumOfStu = " + checkNumOfStu); // false


        // Check if any course name contains 'En'
        boolean checkCourseName = courseList.stream().anyMatch(t -> t.getCourseName().contains("En"));
        System.out.println("checkCourseName = " + checkCourseName);

        // Check that no course should have 'Fall'
        System.out.println(courseList.stream().noneMatch(t -> t.getSeason().contains("Fall")));


        // Print the name of the course which has the highest avg score
        System.out.println(courseList.stream().max(Comparator.comparing(Course::getAvgScore)).get());
        System.out.println(courseList.stream().max(Comparator.comparing(Course::getAvgScore)).get().getCourseName());

        // Sort all the objects by avgScore and then put them in ascending order

        List<Course> sortedCourseList = courseList.
                                            stream().
                                            sorted(Comparator.comparing(Course::getAvgScore)).
                                            toList();
        System.out.println("sortedCourseList = " + sortedCourseList);

        // Return the course with the highest avg score
        List<Course> courseWithHighestAvgScore = courseList.
                                                    stream().
                                                    sorted(Comparator.comparing(Course::getAvgScore)).
                                                    skip(3).
                                                   // limit(1).
                                                    toList();

        System.out.println("courseWithHighestAvgScore = " + courseWithHighestAvgScore);

        // Count the number of courses that have 'Tr'
        //long numOfTrCourses = courseList.stream().filter(t -> t.getCourseName().contains("Tr")).count(); // Use long as data type
        int numOfTrCourses = (int) courseList.stream().filter(t -> t.getCourseName().contains("Tr")).count(); // Use type casting

        System.out.println("numOfTrCourses = " + numOfTrCourses);


    }
}
