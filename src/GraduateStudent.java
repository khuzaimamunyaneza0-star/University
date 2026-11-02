public class GraduateStudent extends Student {

    public GraduateStudent(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double calculateGPA() {
        double gpa = averageGrade() + 0.1;
        if (gpa > 4.0) {
            gpa = 4.0;
        }
        return gpa;
    }

    @Override
    public String getRole() { return "Graduate Student"; }
}