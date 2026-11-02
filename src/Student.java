import java.util.ArrayList;
import java.util.List;

public abstract class Student extends Person {
    private List<Double> grades = new ArrayList<>();
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    public void addGrade(double grade) { grades.add(grade); }
    public List<Double> getGrades() { return grades; }

    public double averageGrade() {
        if (grades.size() == 0) {
            return 0;
        }
        double total = 0;
        for (double g : grades) {
            total = total + g;
        }
        return total / grades.size();
    }

    public abstract double calculateGPA();

    public List<Course> getEnrolledCourses() { return enrolledCourses; }

    public void addCourse(Course c) { enrolledCourses.add(c); }
    public void removeCourse(Course c) { enrolledCourses.remove(c); }

    @Override
    public String toString() {
        return super.toString() + ", GPA: " + calculateGPA();
    }
}