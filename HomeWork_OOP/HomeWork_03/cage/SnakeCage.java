package HomeWork_OOP.HomeWork_03.cage;

import java.time.LocalTime;
import java.util.ArrayList;
import HomeWork_OOP.HomeWork_03.animals.Animal;
import HomeWork_OOP.HomeWork_03.animals.Snake;


public class SnakeCage implements AnimalCage {

    private int clean;
    private ArrayList<Snake> snakes;

    public SnakeCage(ArrayList<Snake> snakes) {
        snakes = new ArrayList<>();
    }

    public void getAnimal() {
        int randomAnimal = (int) ((Math.random()) * snakes.size());
        if (snakes.size() == 0) {
            System.out.println("The cage is empty");
        } else {
            snakes.get(randomAnimal);
        }
    }

    @Override
    public int addAnimal(Animal animal) {
        snakes.add((Snake) animal);
        return snakes.size();
    }

    @Override
    public int delyverFeed(int weightOfFood) {
        int animalPortion = weightOfFood / snakes.size();
        for (Snake wolf : snakes) {
            if (wolf.feed(weightOfFood)) {
                weightOfFood -= animalPortion;
            }
        }
        System.out.println("Remain food: " + weightOfFood);
        return weightOfFood;
    }

    @Override
    public boolean cleanCage() {
        LocalTime now = LocalTime.now();
        if (now.getHour() < 12) {
            return false;
        } else
            return true;
    }

    @Override
    public String toString() {
        return "WolfCage(" + "Wolfs=" + snakes + ", clean" + clean + ")";
    }

}