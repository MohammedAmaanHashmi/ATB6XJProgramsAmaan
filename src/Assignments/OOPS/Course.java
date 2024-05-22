package Assignments.OOPS;

public class Course {
    String courseName;
    double courseFees;
    int courseDuration;


    public Course(String courseName, double courseFees, int courseDuration) {
        this.courseName = courseName;
        this.courseFees = courseFees;
        this.courseDuration = courseDuration;
    }

    public void getCourseName() {
        System.out.println("Course Name is " + courseName);
    }

    public void getCourseFees() {
        System.out.println("Course Fess is " + courseFees);
    }

    public void getCourseDuration() {
        System.out.println("Course Duration is " + courseDuration + " months");
    }


}
