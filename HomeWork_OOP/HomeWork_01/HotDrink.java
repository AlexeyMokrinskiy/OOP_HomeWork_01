package HomeWork_OOP.HomeWork_01;

public class HotDrink extends Drink {

    private int temperature;
    private int price;

    public HotDrink(String drink, double volume, Boolean sugar, int temperature, int price) {
        super(drink, volume, sugar);
        this.temperature = temperature;
        this.price = price;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\ndrink = " + super.getDrink() + "\nvolume = " + super.getVolume() + "\nsugar = " + super.getSugar()
                + "\ntemperature = " + temperature + "\nprice = " + price;
    }

}
