package HomeWork_OOP.HomeWork_02.animals;

public class Wolf extends Animal {

    private int teethNumber;

    protected static final int MAX_WEIGHT = 50;
    protected static final String TYPE = "Wolf";

    public Wolf(int birthYear, int weight, int limb, int teethNumber) {
        super(birthYear, weight, limb);
        this.teethNumber = teethNumber;

    }

    @Override
    public boolean feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight += foodWeight;
            System.out.println("Wolf is feeded");
            return true;
        }
        else {
            System.out.println("Wolf is not hangry");
        }
        return false;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public int getTeethNumber() {
        return teethNumber;
    }

    public void setTeethNumber(int teethNumber) {
        this.teethNumber = teethNumber;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

}
