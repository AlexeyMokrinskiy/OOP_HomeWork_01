package HomeWork_OOP.HomeWork_05.animals;

public class Lion extends Animal implements Comparable<Lion> {

    public static Object lions;
    private int maneVolume;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";

    public Lion(int age, int weight, int countLimbs, int maneVolume) {
        super(age, weight, countLimbs);
        this.maneVolume = maneVolume;

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

    @Override
    public String toString() {
        return "Lion{" + "age =" + age + ", weight =" + weight + "}";
    }

    @Override
    public int compareTo(Lion o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }

}
