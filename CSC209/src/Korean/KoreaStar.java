package Korean;

public class KoreaStar {
    String firstname;
    String lastname;
    int age;
    String band;

    public KoreaStar(String firstname, String lastname, int age, String band){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.band = band;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }


}
