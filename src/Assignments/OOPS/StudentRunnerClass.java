package Assignments.OOPS;

public class StudentRunnerClass {
    public static void main(String[] args) {
        Student student=new Student("Amaan",21,10,"C");
        student.getStudentDetails();
        Course course=new Course("Automation Testing",10000,4);
        course.getCourseName();
        course.getCourseFees();
        course.getCourseDuration();
        Payment payment=new Payment("ICICI","Cash",10000);
        payment.printBankNameAndPaymentType();
    }





}
