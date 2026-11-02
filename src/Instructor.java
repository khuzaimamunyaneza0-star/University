import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {
    private String department;
    private List<Course> coursesTaught = new ArrayList<>();

    public Instructor(String id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public List<Course> getCoursesTaught() { return coursesTaught; }

    public void addCourse(Course c) { coursesTaught.add(c); }

    @Override
    public String getRole() { return "Instructor"; }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}