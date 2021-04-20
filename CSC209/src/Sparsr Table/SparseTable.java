
public class SparseTable {
    Registernode[] students; // 1-7999
    Registernode[] classes; // 0-299

    public SparseTable(int studentsAmount, int classAmount) {
        students = new Registernode[studentsAmount];
        classes = new Registernode[classAmount];
    }

    public void addRegister(int studentID, int classID) {

        Registernode newRegis = new Registernode(studentID, classID, -1, null, null);

        // ถ้า studentID ของ array students นั้นว่าง ให้ใส่ข้อมูลลงไปได้เลย
        // หรือ classID ที่เรารับเข้ามา น้อยกว่า classid ของ array ของ students
        // ในตำแหน่ง studentID ที่เรารับเข้ามา
        if (students[studentID] == null || classID < this.students[studentID].classid) {
            newRegis.nextClass = this.students[studentID];
            students[studentID] = newRegis;

        } else {
            Registernode c; // สร้าง node เพื่อเช็ค
            // loop ไปเรื่อยๆ จน ตัวถัดไปเป็น null และ classID ที่เรารับเข้ามาน้อยกว่า
            // classid ก่อนหน้า
            for (c = students[studentID]; c.nextClass != null && c.nextClass.classid < classID; c = c.nextClass)
                ;
            newRegis.nextClass = c.nextClass;
            c.nextClass = newRegis;
        }
        if (classes[classID] == null || studentID < this.classes[classID].studentid) {
            newRegis.nextPerson = classes[classID];
            classes[classID] = newRegis;
        } else {
            Registernode p;
            for (p = classes[classID]; p.nextPerson != null && p.nextPerson.studentid < studentID; p = p.nextPerson)
                ;
            newRegis.nextPerson = p.nextPerson;
            p.nextPerson = newRegis;
        }
    }
}
