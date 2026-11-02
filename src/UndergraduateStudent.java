public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double calculateGPA() {
        return averageGrade();
    }

    @Override
    public String getRole() { return "Undergraduate Student"; }
}