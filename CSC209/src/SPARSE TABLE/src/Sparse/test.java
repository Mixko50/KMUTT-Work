package Sparse;

public class test {
    public static void main(String[] args) {
        SparseTable s1 = new SparseTable(8000,300);
        s1.addRegister(20,10);
        s1.addRegister(20,20);
        s1.addRegister(20,30);
        s1.addRegister(20,40);
        System.out.println(s1.arrStudents[20].classId);
    }
}
