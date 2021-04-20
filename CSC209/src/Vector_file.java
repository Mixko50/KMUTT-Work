import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class Vector_file {
    public static void main(String[] args) throws IOException {
        Magic m1 = new Magic("fireball", 8, "burning", "fire");
        Magic m2 = new Magic("summon", 6, "Invite god", "wind");
        Magic m3 = new Magic("Time travel", 5, "Go back in time", "wind");
        Vector player1 = new Vector();
        player1.add(m1);
        player1.add(m2);
        player1.add(m3);
        System.out.println(m2.getSpell() + " " + m2.getPower());
        System.out.println(((Magic) player1.elementAt(2)).getSpell()); //cast change from vector to magic
        for (int i = 0; i < player1.size(); i++) {
            System.out.print(" " + ((Magic) player1.elementAt(i)).getSpell());
        }
        player1.removeElementAt(1);
        System.out.println("Removed");
        for (int i = 0; i < player1.size(); i++) {
            System.out.print(" " + ((Magic) player1.elementAt(i)).getSpell());
        }
        System.out.println(player1.size() + " " + player1.capacity()); //vector's capacity is 10
        player1.add(new Magic("healling", 2, "safe life", "water"));
        player1.add(new Magic("fly", 4, "Fly in the air", "wind"));
        System.out.println(player1.size() + " " + player1.capacity());
        player1.add(new Magic("Teleport", 5, "Move anywhere", "earth"));
        player1.add(new Magic("Turtle wave", 5, "Destroy", "wind"));
        player1.add(m3);
        player1.add(m3);
        player1.add(m3);
        player1.add(m3);
        player1.add(m3);
        System.out.println(player1.size() + " " + player1.capacity()); //if over 10 default of capacity will plus 10 -> 20

        final int SPELL_SIZE = 15, ABILITY_SIZE = 20, ELEMENT_SIZE = 5;
        final int MAGIC_SIZE = 15 + 4 + 20 + 5;

        RandomAccessFile filepointer = new RandomAccessFile("player1.dat", "rw");
        byte [] spell = new byte[SPELL_SIZE];
        byte [] ability = new byte[ABILITY_SIZE];
        byte [] element = new byte[ELEMENT_SIZE];
        spell = (((Magic) player1.elementAt(0)).getSpell() + "               ").getBytes();
        filepointer.write(spell, 0, SPELL_SIZE); //write file

        filepointer.writeInt(((Magic) player1.elementAt(0)).getPower());

        ability = (((Magic) player1.elementAt(0)).getAbility() + "                    ").getBytes();
        filepointer.write(ability, 0, ABILITY_SIZE); //write file

        element = (((Magic) player1.elementAt(0)).getElement() + "     ").getBytes();
        filepointer.write(element, 0, ELEMENT_SIZE); //write file

        for (int i = 0; i < player1.size(); i++) {
            spell = (((Magic) player1.elementAt(i)).getSpell() + "               ").getBytes();
            filepointer.write(spell, 0, SPELL_SIZE); //write file
            filepointer.writeInt(((Magic) player1.elementAt(i)).getPower());

            ability = (((Magic) player1.elementAt(i)).getAbility() + "                    ").getBytes();
            filepointer.write(ability, 0, ABILITY_SIZE); //write file

            element = (((Magic) player1.elementAt(i)).getElement() + "     ").getBytes();
            filepointer.write(element, 0, ELEMENT_SIZE); //write file
        }

        //magic 0 is the beginning of the files which is byte number 0
        //get spell of the magic 1
        //one magic is 44 bytes => magic1 will start at byte number44
        //Actually byte number 44     is the spell of the magic 1
        //         byte number 44+15=59    is the power of the magic 1
        //         byte number 44+15+4 = 63  is the ability of magic 1
        System.out.println("Current byte of my file pointer is -> "+filepointer.getFilePointer());
        filepointer.seek(63); //for find the file
        byte[] x = new byte[ABILITY_SIZE];
        filepointer.read(x,0,ABILITY_SIZE);
        System.out.println(" ->"+new String(x));
        System.out.println("Current position -> "+filepointer.getFilePointer());
    }
}
