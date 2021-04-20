
public class Registernode {
    int studentid;
    int classid;
    double grade;
    Registernode nextPerson;
    Registernode nextClass;

    public Registernode(int studentid, int classid, double grade, Registernode nextPerson, Registernode nextClass) {
        this.studentid = studentid;
        this.classid = classid;
        this.grade = grade;
        this.nextPerson = nextPerson;
        this.nextClass = nextClass;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
