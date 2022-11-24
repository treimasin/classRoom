package classroom;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {

    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Adding a student to the classroom...");

        System.out.println("Please enter the name of student: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the grade: ");
        int grade = intScanner.nextInt();

        System.out.println("Please enter the course: ");
        String course = scanner.nextLine();

        Student student = new Student(name, grade, course);

        students.add(student);

        System.out.println(student.name + " was added to the classroom successfully.");

    }

    public void viewStudents() {

        System.out.println("Viewing all the students in the class...");

        for (Student student: students) {
            System.out.println(student);
        }

    }

    public void viewStudent() {

        System.out.println("Please enter the name of the student you are looking for: ");

        String name = scanner.nextLine();

        for (Student student: students) {
            if (student.name.equals(name)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void removeStudent() {

        System.out.println("Please enter the name of the student you want to remove: ");

        String name = scanner.nextLine();

        for (Student student: students){
            if (student.name.equals(name)) {

                students.remove(student);

                System.out.println(student.name +  " was removed successfully.");

                return;
            }
        }
        System.out.println("Student was not found.");
    }

    public void findGreaterThan5() {
        ArrayList<Student> greaterThan5 = new ArrayList<>();

        for (Student student: students) {
            if (student.grade > 5) {
                System.out.println(student);
            }
        }
    }

    public void findLessThan5() {
        ArrayList<Student> lessThan5 = new ArrayList<>();

        for (Student student: students) {
            if (student.grade < 5) {
                System.out.println(student);
            }
        }
    }

    public void updateStudentCourse() {
        // Find student by name, then update the student course with new course provided

        System.out.println("Please enter the name of the student to update: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the course you want to change to: ");
        String course = scanner.nextLine();

        for (Student student: students) {
            if (student.name.equals(name)) {
                student.course = course;
                System.out.println("Student course has been updated.");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void updateStudentGrade() {

        System.out.println("Please enter the name of the student to update: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the grade you want to change to: ");
        int grade = intScanner.nextInt();

        for (Student student: students) {
            if(student.name.equals(name)) {
                student.grade = grade;
                System.out.println("Students grade has been updated.");
                return;
            }
        }
        System.out.println("Student not found!");
    }

}
