
public class SparseTableLab {
    public static void main(String[] args) {
        SparseTable table = new SparseTable(8000, 300);
        table.addRegister(20, 50);
        table.addRegister(20, 55);
        table.addRegister(20, 200);
        System.out.print("classes of Mr.20 --> ");
        for (Registernode p = table.students[20]; p != null; p = p.nextClass) {
            System.out.print(p.classid + " ");
        }
        table.addRegister(20, 150);
        System.out.print("\nclasses of Mr.20 --> ");
        for (Registernode p = table.students[20]; p != null; p = p.nextClass) {
            System.out.print(p.classid + " ");
        }

        table.addRegister(20, 10);
        System.out.print("\nclasses of Mr.10 --> ");
        for (Registernode p = table.students[20]; p != null; p = p.nextClass) {
            System.out.print(p.classid + " ");
        }
        table.addRegister(1000, 55);
        table.addRegister(2000, 55);
        System.out.print("\nStudents of class 55 -> ");
        for (Registernode p = table.classes[55]; p != null; p = p.nextPerson) {
            System.out.print(p.studentid + " ");
        }
        table.addRegister(600, 55);
        System.out.print("\nStudents of class 55 -> ");
        for (Registernode p = table.classes[55]; p != null; p = p.nextPerson) {
            System.out.print(p.studentid + " ");
        }
    }
}
