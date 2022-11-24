package classroom;

public class Student {

    public String name;
    public int grade;
    public String course;

    public Student (String name, int grade, String course) {

        this.name = name;
        this.grade = grade;
        this.course = course;

        }

    public String toString() {
        return "Name: " + name + ", Grade: " + grade + ", Course: " + course;
    }

}
