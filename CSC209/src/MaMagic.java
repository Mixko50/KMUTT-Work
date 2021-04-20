import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class MaMagic {
    public static void main(String[] args) throws IOException {
        Magic m1 = new Magic("NamoPuttaYa" , 68,"bullet" , "wind");
        Magic m2 = new Magic("Vingadium Leviosa" , 8 , "fly","earth");
        Magic m3 = new Magic("NooRut",10,"Thinknhad" , "fire");
        Magic m4 = new Magic("Sirivanvari" , 1 , "Ekob" , "water");

        Vector player = new Vector();
        player.add(m1);
        player.add(m2);
        player.add(m3);
        player.add(m4);

        System.out.println(((Magic) player.elementAt(0)).getSpell());

        player.add(new Magic("SiaO" , 112,"LedYud", "water"));

        final int SPELL_SIZE = 20 , POWER_SIZE = 4 , ABILITY_SIZE = 20 , ELEMENT_SIZE = 6;
        final int TOTAL = 50;

        RandomAccessFile filePointer = new RandomAccessFile("file.dat","rw");
        byte [] spell = new byte[SPELL_SIZE];
//        byte [] power = new byte[POWER_SIZE];
        byte [] ability = new byte[ABILITY_SIZE];
        byte [] element = new byte[ELEMENT_SIZE];

        for (int i = 0; i < player.size(); i++) {
            spell = (((Magic) player.elementAt(i)).getSpell()+"                    ").getBytes();
            filePointer.write(spell,0,SPELL_SIZE);

//           power = (((Magic) player.elementAt(i)).getPower()+"    ").getBytes();
            filePointer.writeInt(((Magic) player.elementAt(i)).getPower());

            ability = (((Magic) player.elementAt(i)).getAbility()+"                    ").getBytes();
            filePointer.write(ability,0,ABILITY_SIZE);

            element = (((Magic) player.elementAt(i)).getElement()+"      ").getBytes();
            filePointer.write(element,0,ELEMENT_SIZE);
        }
        filePointer.seek(0);
        byte [] x = new byte[TOTAL];
        filePointer.read(x,0,TOTAL);
        System.out.println(new String(x));
        filePointer.seek(20);
        System.out.println(filePointer.readInt());

    }
}
