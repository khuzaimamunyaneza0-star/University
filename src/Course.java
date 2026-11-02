import java.util.HashSet;
import java.util.Set;

public class Course {
    private String code;
    private String title;
    private int credits;
    private Instructor instructor;
    private Set<Student> students = new HashSet<>();

    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public Instructor getInstructor() { return instructor; }
    

    public void setCode(String code) { this.code = code; }
    public void setTitle(String title) { this.title = title; }
    public void setCredits(int credits) { this.credits = credits; }
    public Set<Student> getStudents() { return students; }


    public void assignInstructor(Instructor i) {
        this.instructor = i;
        i.addCourse(this);
    }

    public boolean enroll(Student s) {
        if (students.contains(s)) {
            return false;
        }
        students.add(s);
        s.addCourse(this);
        return true;
    }

    public boolean drop(Student s) {
        if (!students.contains(s)) {
            return false;
        }
        students.remove(s);
        s.removeCourse(this);
        return true;
    }

    @Override
    public String toString() {
        return "Course: " + code + ", Title: " + title + ", Credits: " + credits;
    }
}