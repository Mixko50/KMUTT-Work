package Sparse;

public class SparseTable {
    Registernode[] arrStudents;
    Registernode[] arrClassid;

    public SparseTable(int studentAmout, int classAmout) {
        arrStudents = new Registernode[studentAmout];
        arrClassid = new Registernode[classAmout];
    }

    public void addRegister(int newStudent, int newClass) { // stu 50 class 200
        Registernode newRegis = new Registernode(newStudent, newClass, -1, null, null);
        if (arrStudents[newStudent] == null || newClass < this.arrStudents[newStudent].classId) {
            newRegis.nextClass = this.arrStudents[newStudent];
            this.arrStudents[newStudent] = newRegis;
        } else {
            Registernode p;
            for (p = arrStudents[newStudent]; p.nextClass != null
                    && this.arrStudents[newStudent].classId < newClass; p = p.nextClass)
                ;
            newRegis.nextClass = p.nextClass;
            p.nextClass = newRegis;
        }

        if (arrClassid[newClass] == null || newStudent < this.arrClassid[newClass].studentId) {
            newRegis.nextPerson = arrClassid[newClass];
            arrClassid[newClass] = newRegis;
        } else {
            Registernode x;
            for (x = arrClassid[newClass]; x.nextPerson != null
                    && this.arrClassid[newClass].studentId < newStudent; x = x.nextPerson)
                ;
            newRegis.nextPerson = x.nextPerson;
            x.nextPerson = newRegis;
        }
    }
}
