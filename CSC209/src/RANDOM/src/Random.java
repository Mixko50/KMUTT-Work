import java.io.IOException;
import java.io.RandomAccessFile;

public class Random {
    String name;
    String id;
    double grade;
    String[] course;

    final int NAME = 20;
    final int ID = 10;
    final int COURSENAME = 10;
    final int TOTAL = 130;

    public Random(String name, String id, double grade){
        this.name = name;
        this.grade = grade;
        this.id = id;
        this.course = new String[10];
    }

    public void writeToFile() throws IOException{
        RandomAccessFile r = new RandomAccessFile("Mixko.dat","w");
        byte[] name = new byte[NAME];
        name = (this.name+"                    ").getBytes();
        r.write(name,0,NAME);
        byte[] id = new byte[ID];
        id = (this.id+"          ").getBytes();
        r.write(id,0,ID);

        r.writeDouble(this.grade);

        byte[] course = new byte[COURSENAME];
        for (int i = 0 ; i<course.length;i++){
            course = (this.course[i]+"          ").getBytes();
            r.write(course,0,COURSENAME);
        }
    }

    public void readInFile() throws IOException {
        RandomAccessFile r = new RandomAccessFile("Mixko.dat","r");
        r.seek(0);
        byte[] x = new byte[TOTAL];
        r.read(x);
        System.out.println(new String(x));

    }
}
