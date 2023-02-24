package HomeWork_OOP.HomeWork_03.animals;

public class Wolf extends Animal implements Comparable<Wolf> {

    private int teethNumber;

    protected static final int MAX_WEIGHT = 50;
    protected static final String TYPE = "Wolf";

    public Wolf(int age, int weight, int countLimbs, int teethNumber) {
        super(age, weight, countLimbs);
        this.teethNumber = teethNumber;

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

    @Override
    public String toString() {
        return "Wolf{" + "age =" + age + ", weight =" + weight + "}";
    }

    @Override
    public int compareTo(Wolf o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}
