public class CityIndex implements Comparable<CityIndex>{
    String city;
    long location;

    public CityIndex(String city , long location){
        this.city = city;
        this.location = location;
    }

    public int compareTo(CityIndex c){
        return this.city.compareTo(c.city);
    }
}
