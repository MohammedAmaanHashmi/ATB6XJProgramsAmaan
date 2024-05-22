package Assignments.OOPS;

public class Student {
    String studentName;
    int studentId;
    int std;
    String div;

    public Student(String studentName, int studentId, int std, String div) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.std = std;
        this.div = div;
    }

    public void getStudentDetails() {
        System.out.println("Student Name is " + studentName);
        System.out.println("Student Id is " + studentId);
        System.out.println("Student std is " + std);
        System.out.println("Student div is " + div);
    }

    public void dancing() {
        System.out.println(studentName + " Likes dancing");
    }

    public void singing() {
        System.out.println(studentName + " Likes singing");
    }

    public void gaming() {
        System.out.println(studentName + " Likes gaming");
    }
}
