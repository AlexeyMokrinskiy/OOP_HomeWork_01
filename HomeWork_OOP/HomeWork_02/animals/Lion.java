package HomeWork_OOP.HomeWork_02.animals;

// Задание 1.1
public class Lion extends Animal {

    private int maneVolume;

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";

    public Lion(int age, int weight, int countLimbs, int maneVolume) {
        super(age, weight, countLimbs);
        this.maneVolume = maneVolume;

    }

    public boolean feed(int foodWeight) {
        if (weight + foodWeight <= getMaxWeight()) {
            weight += foodWeight;
            System.out.println("Lion is feeded");
            return true;
        } else {
            System.out.println("Lion is not hangry");
        }
        return false;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

}
