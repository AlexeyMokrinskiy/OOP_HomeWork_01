package HomeWork_OOP.HomeWork_01;

public abstract class Drink {
    private String drink;
    private double volume;
    private Boolean sugar;

    public Drink() {
    }

    public Drink(String drink, double volume, Boolean sugar) {
        this.drink = drink;
        this.volume = volume;
        this.sugar = sugar;

    }

    public String getDrink() {
        return drink;
    }

    public double getVolume() {
        return volume;
    }

    public Boolean getSugar() {
        return sugar;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSugar(Boolean sugar) {
        this.sugar = sugar;
    }

}