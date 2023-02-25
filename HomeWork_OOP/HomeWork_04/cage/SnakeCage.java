package HomeWork_OOP.HomeWork_04.cage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import HomeWork_OOP.HomeWork_04.animals.Snake;
import HomeWork_OOP.HomeWork_04.comparators.SnakeComparator;

public class SnakeCage implements AnimalCage<Snake> {

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
    public int addAnimal(Snake animal) {
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
        return "SnakeCage(" + "snakes=" + snakes + ", clean" + clean + ")";
    }

    public ArrayList<Snake> getSnakes(){
        return snakes;
    }

    public void SortByBodyLenght(){
        Collections.sort(snakes, new SnakeComparator());
    }

}