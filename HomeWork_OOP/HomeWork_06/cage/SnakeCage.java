package HomeWork_OOP.HomeWork_06.cage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import HomeWork_OOP.HomeWork_06.animals.Snake;
import HomeWork_OOP.HomeWork_06.comparators.SnakeComparator;

public class SnakeCage implements AnimalCage<Snake> {

    private int clean;
    private ArrayList<Snake> snakes;

    public SnakeCage(ArrayList<Snake> snakes) {
        snakes = new ArrayList<Snake>();
    }

    public Snake getAnimal() {
        int randomAnimal = (int) ((Math.random()) * snakes.size());
        if (snakes.size() == 0) {
            System.out.println("The cage is empty");
        } else {
            snakes.get(randomAnimal);
        }
        return null;
    }

    @Override
    public int addAnimal(Snake animal) {
        snakes.add((Snake) animal);
        return snakes.size();
    }

    @Override
    public int delyverFeed(int weightOfFood) {
        int animalPortion = weightOfFood / snakes.size();
        for (Snake snake : snakes) {
            if (snake.feed(weightOfFood)) {
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

    @Override
    public int countAnimals() {
        return snakes.size();
    }

    public Snake takeOffAnimal() {
        if (snakes == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(snakes.size());
            return (Snake) snakes.remove(i);
        }
    }

}