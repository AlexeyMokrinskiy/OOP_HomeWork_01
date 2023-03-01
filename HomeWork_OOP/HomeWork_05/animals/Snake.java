package HomeWork_OOP.HomeWork_05.animals;

public class Snake extends Animal {

    private int bodyLenght;

    protected static final int MAX_WEIGHT = 30;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int countLimbs, int bodyLenght) {
        super(age, weight, countLimbs);
        this.bodyLenght = bodyLenght;

    }

    @Override
    public String getType() {
        return TYPE;
    }

    public int getBodyLenght() {
        return bodyLenght;
    }

    public void setBodyLenght(int bodyLenght) {
        this.bodyLenght = bodyLenght;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {
        return "Snake{" + "age =" + age + ", weight =" + weight + "}";
    }
}
