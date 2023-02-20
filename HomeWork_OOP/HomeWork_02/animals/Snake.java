package HomeWork_OOP.HomeWork_02.animals;

// Задание 1.1
public class Snake extends Animal {

    private int bodyLenght;

    protected static final int MAX_WEIGHT = 30;
    protected static final String TYPE = "Snake";

    public Snake(int birthYear, int weight, int limb) {
        super(birthYear, weight, limb);

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

}
