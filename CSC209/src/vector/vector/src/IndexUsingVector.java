import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Vector;

public class IndexUsingVector {
    public static void main(String[] args) {
        try {
            RandomAccessFile filePointer = new RandomAccessFile("city.dat","rw");
            byte[] city = new byte[150];
            filePointer.read(city,0,150);
            System.out.println("The first city is "+new String(city));
            long location = 150+8+8+50+2+3+150+10;
            filePointer.seek(location);
            int pop = filePointer.readInt();
            System.out.println("Its population is "+pop);

            location = 2*385;
            filePointer.seek(location);
            filePointer.read(city,0,150);//after read the city location will pass the city
            //it is lat + long

            location = filePointer.getFilePointer()+8+8;
            filePointer.seek(location);
//            System.out.println(filePointer.getFilePointer());
//            location+=filePointer.getFilePointer()+8+8; //skip lat and long (double+double)
            filePointer.seek(location);
            byte[] country = new byte[50];
            filePointer.read(country,0,50);

            location = filePointer.getFilePointer() + 2 + 3 +150 +10 ;
            filePointer.seek(location);
            pop = filePointer.readInt();
            System.out.println("The 3rd city is "+new String(city).trim() +" "+new String(country).trim()+" "+pop);

            Vector cities = new Vector();
            filePointer.seek(0);
            int i = 0;
            location = 0;
            while (location < filePointer.length()){
                filePointer.seek(location);
                filePointer.read(city,0,150);
                CityIndex c = new CityIndex(new String(city), 385*i);
                cities.add(c);
                i++;
                location = 385*i;
            }

            System.out.println(((CityIndex) cities.elementAt(200)).city);
            System.out.println(((CityIndex) cities.elementAt(200)).location);

            location = ((CityIndex) cities.elementAt(200)).location + 150 + 8;
            filePointer.seek(location);
            double longitude = filePointer.readDouble();
            System.out.println("Longitude of city number 200 is " + longitude);

            for (int j = 0; j < cities.size(); j++) {
                String c = ((CityIndex) cities.elementAt(j)).city.trim();
                if (c.equalsIgnoreCase("Munich")){
                    location = ((CityIndex) cities.elementAt(j)).location;
                    filePointer.seek(location+150+8+8+50+2+3+150);
                    byte[] type = new byte[10];
                    filePointer.read(type,0,10);
                    System.out.println("Type of New York is "+new String(type).trim()+" !");
                    break;
                }
            }

            Vector v = new Vector();
            v.add("fgdfg") ;v.add("wer") ; v.add("cyb") ; v.add("ewr");
            Collections.sort(v);
            System.out.println(v.elementAt(0));
            Collections.sort(cities);

            for (int j = 0; j < 10; j++) {
                System.out.println(j+1+". "+((CityIndex)  cities.elementAt(j)).city);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
