import classroom.Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the classroom!");

        Class roomClass = new Class();

        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {
            System.out.println("""
                    Please choose an activity below
                    1. Add students
                    2. View all students
                    3. View a single student by name
                    4. Remove a student from the classroom
                    5. View students with grade greater than 5
                    6. View students with grade less than 5
                    7. Update students course
                    8. Update students grade
                    """);

            input = scanner.nextLine();

            switch (input) {
                case "exit":
                    System.out.println("Exiting the classroom...");
                    break;
                case "1":
                    roomClass.addStudent();
                    break;
                case "2":
                    roomClass.viewStudents();
                    break;
                case "3":
                    roomClass.viewStudent();
                    break;
                case "4":
                    roomClass.removeStudent();
                    break;
                case "5":
                    roomClass.findGreaterThan5();
                    break;
                case "6":
                    roomClass.findLessThan5();
                    break;
                case "7":
                    roomClass.updateStudentCourse();
                    break;
                case "8":
                    roomClass.updateStudentGrade();
                    break;
                default:
                    System.out.println("Please enter a valid input.");
                    break;
            }

        } while (!input.equals("exit"));
    }
}