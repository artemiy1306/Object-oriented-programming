package Task1;

public class HotDrink extends Drink {
    private int temperature;
    public HotDrink(String name, double volume, int temperature, double price) {
        super(name, volume, price);
        this.temperature = temperature;
    }
    public  int getTemperature(){
        return temperature;
    }
    @Override
    public String toString() {
        return super.toString() + ", Температура : " + temperature;

    }
}
