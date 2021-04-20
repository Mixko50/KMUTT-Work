package Sparse;

public class Registernode {
    int studentId;
    int classId;
    double grade;
    Registernode nextClass;
    Registernode nextPerson;

    public Registernode(int studentId, int classId, double grade, Registernode nextClass, Registernode nextPerson) {
        this.studentId = studentId;
        this.classId = classId;
        this.grade = grade;
        this.nextClass = nextClass;
        this.nextPerson = nextPerson;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
