package Task1;

public class Drink {
    private String name;
    private double volume;
    private double price;

    public Drink(String name, double volume, double price) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {

        return name;
    }


    public void setVolume(int volume) {

        this.volume = volume;
    }

    public double getVolume() {

        return volume;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Drink " +
                "Название:'" + name + '\'' +
                ", Объём:" + volume +
                ", Цена:" + price ;

    }
}


