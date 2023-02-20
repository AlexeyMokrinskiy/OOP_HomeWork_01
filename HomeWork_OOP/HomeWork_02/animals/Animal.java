package HomeWork_OOP.HomeWork_02.animals;

// Задание 1.1
public abstract class Animal {

    protected int age;
    protected int weight;
    protected int countLimbs;

    Animal(int birthYear, int weight, int limb) {
        this.age = birthYear;
        this.weight = weight;
        this.countLimbs = limb;
    }

    public abstract int getMaxWeight();

    public abstract String getType();

    public boolean feed(int foodWeight) { // Задание 1.2
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight = +foodWeight;
        } else
            System.out.println("Max weight exeeded");
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCountLimbs() {
        return countLimbs;
    }

    public void setCountLimbs(int countLimbs) {
        this.countLimbs = countLimbs;
    }

}
