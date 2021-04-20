package Korean;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class Korea {
    public static void main(String[] args) throws IOException {
        KoreaStar k1 = new KoreaStar("Pom","bomer",20,"K1");
        KoreaStar k2 = new KoreaStar("Mixko","kili",17,"K2");
        Vector koreaBand = new Vector();
        koreaBand.add(k1);
        koreaBand.add(k2);
        koreaBand.add(new KoreaStar("Sakuara","IU",22,"RRR"));
        koreaBand.add(new KoreaStar("Rose","Park",25,"BlackPink"));
        koreaBand.add(new KoreaStar("Soy","Sudjai",18,"PBOY"));
        System.out.println(((KoreaStar) koreaBand.elementAt(2)).lastname);

        RandomAccessFile filePointer = new RandomAccessFile("kaoree.dat","rw");
        final int FIRSTNAME = 20;
        final int LASTNAME = 20;
        final int BAND = 20;
        final int TOTAL = FIRSTNAME+LASTNAME+4+BAND;

        byte[] firstname = new byte[FIRSTNAME];
        byte[] lastname = new byte[LASTNAME];
        byte[] band = new byte[BAND];

        for (int i = 0; i < koreaBand.size(); i++) {
            firstname = (((KoreaStar) koreaBand.elementAt(i)).getFirstname()+"                    ").getBytes();
            filePointer.write(firstname,0,FIRSTNAME);

            lastname = (((KoreaStar) koreaBand.elementAt(i)).getLastname()+"                    ").getBytes();
            filePointer.write(lastname, 0, LASTNAME);

            filePointer.writeInt(((KoreaStar) koreaBand.elementAt(i)).getAge());

            band = (((KoreaStar) koreaBand.elementAt(i)).getBand()+"                    ").getBytes();
            filePointer.write(band,0,BAND);
        }

        filePointer.seek(0);
        byte[] x = new byte[TOTAL];
        filePointer.read(x);
        System.out.println(new String(x));

        filePointer.seek(0);
        byte[] printFirstname = new byte[FIRSTNAME];
        byte[] printLastname = new byte[LASTNAME];
        byte[] printBand = new byte[BAND];
        for (int i = 0; i < koreaBand.size(); i++) {
            filePointer.read(printFirstname,0,FIRSTNAME);
            System.out.print("Name: ");
            System.out.println(new String(printFirstname).trim()+" ");

            System.out.print("Lastname: ");
            filePointer.read(printLastname,0,LASTNAME);
            System.out.println(new String(printLastname).trim());

            System.out.println("Age: "+filePointer.readInt()+" ");

            System.out.print("Band: ");
            filePointer.read(printBand,0,BAND);
            System.out.println(new String(printBand).trim());

            System.out.println("--------------------------------");

//            filePointer.seek((FIRSTNAME+LASTNAME+4+BAND)*(i+1));
        }


    }
}
