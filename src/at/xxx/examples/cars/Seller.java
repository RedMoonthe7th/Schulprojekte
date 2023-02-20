package at.xxx.examples.cars;

public class Seller {
    //Gedächtnisvariablen
    private String name;
    private String nationality;
    private int discount;

    //Constructor
    public Seller(String name, String nationality, int discount) {
        this.name = name;
        this.nationality = nationality;
        this.discount = discount;
    }

    //Setter & Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
