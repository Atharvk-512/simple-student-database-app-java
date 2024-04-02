import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ask user how many students to add
        System.out.println("Enter no of students to enroll :");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        // create n number of new students
        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Enter details for student " + (i+1) + ": ");
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println("\n");
        }

        for(int i=0; i<numberOfStudents; i++){
            students[i].showInfo();
            System.out.println("\n");
        }
    }
}
