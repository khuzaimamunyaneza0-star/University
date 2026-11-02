import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Student> allStudents = new ArrayList<>();

        Map<String, Course> courses = new HashMap<>();

        Map<String, Instructor> assignments = new HashMap<>();

        Instructor i = new Instructor("I1", "Dr. Uwase", "uwase@school.edu", "CS");

        UndergraduateStudent u = new UndergraduateStudent("S1", "Aline", "aline@school.edu");
        GraduateStudent g = new GraduateStudent("S2", "Eric", "eric@school.edu");

        u.addGrade(3.5);
        u.addGrade(3.0);
        g.addGrade(3.0);
        g.addGrade(4.0);

        Course c = new Course("CS101", "Intro to Java", 3);

        allStudents.add(u);
        allStudents.add(g);

        courses.put(c.getCode(), c);

        c.assignInstructor(i);
        assignments.put(c.getCode(), i);
        c.enroll(u);
        c.enroll(g);
        c.enroll(u);

        System.out.println(courses.get("CS101"));
        System.out.println(assignments.get("CS101"));
        System.out.println("Roster size: " + c.getStudents().size());

        for (Student s : c.getStudents()) {
            System.out.println(s.getRole() + ": " + s.getName() + ", GPA = " + s.calculateGPA());
        }

        c.drop(g);
        System.out.println("After drop, roster size: " + c.getStudents().size());
        System.out.println("All students: " + allStudents.size());
    }
}