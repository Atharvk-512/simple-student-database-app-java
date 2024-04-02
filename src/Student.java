import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // constructor: take student name and year as input

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student grade year: \n1 for Freshmen\n2 for Sophomore\n3 for Junior\n4 for Senior");
        this.gradeYear = in.nextInt();

        setStudentID();
    }

    // generate id
    private void setStudentID(){
        // grade level + ID
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // enroll in courses
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                tuitionBalance += costOfCourse;
                courses = courses + "\n\t" + course;
            }
            else break;
        } while(1==1);
        System.out.println("Enrolled in " + courses + "\nTuition balance: $" + tuitionBalance);
    }


    //view balance
    public void viewBalance(){
        System.out.println("Your balance is : $" + tuitionBalance);

    }

    // pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter payment amount: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // show status
    public void showInfo(){
        System.out.println("Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudentID: " + studentId +
                "\nCourses enrolled in: " + courses +
                "\nBalance is: " + tuitionBalance);
    }
}
