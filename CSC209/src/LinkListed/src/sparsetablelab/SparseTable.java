package sparsetablelab;

public class SparseTable {
    Registernode[] students; //1-7999
    Registernode[] classes; //0-299

    public SparseTable(int studentsAmount, int classAmount){
        students = new Registernode[studentsAmount];
        classes = new Registernode[classAmount];
    }

    public void addRegister(int studentID , int classID){

        Registernode newRegis = new Registernode(studentID,classID, -1 , null , null);

        if (students[studentID] == null || classID < this.students[studentID].classid) {
            newRegis.nextClass = this.students[studentID];
            students[studentID] = newRegis;
        } else {
            Registernode c;
            for (c = students[studentID] ; c.nextClass!= null &&  c.nextClass.classid < classID  ; c = c.nextClass);
            newRegis.nextClass = c.nextClass;
            c.nextClass = newRegis;
        }
        if(classes[classID] == null || studentID < this.classes[classID].studentid) {
            newRegis.nextPerson = classes[classID];
            classes[classID] = newRegis;
        } else {
            Registernode p;
            for (p = classes[classID] ; p.nextPerson!=null && p.nextPerson.studentid < studentID ; p = p.nextPerson);
            newRegis.nextPerson = p.nextPerson;
            p.nextPerson = newRegis;
        }
    }
}
