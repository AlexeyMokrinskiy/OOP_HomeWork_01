package HomeWork_OOP.HomeWork_06.cage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import HomeWork_OOP.HomeWork_06.animals.Wolf;
import HomeWork_OOP.HomeWork_06.comparators.WolfComparator;

public class WolfCage implements AnimalCage<Wolf> {

    private int clean;
    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs) {
        wolfs = new ArrayList<>();
    }

    public Wolf getAnimal() {
        int randomAnimal = (int) ((Math.random()) * wolfs.size());
        if (wolfs.size() == 0) {
            System.out.println("The cage is empty");
        } else {
            wolfs.get(randomAnimal);
        }
        return null;
    }

    @Override
    public int addAnimal(Wolf animal) {
        wolfs.add((Wolf) animal);
        return wolfs.size();
    }

    @Override
    public int delyverFeed(int weightOfFood) {
        int animalPortion = weightOfFood / wolfs.size();
        for (Wolf wolf : wolfs) {
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
        return "WolfCage(" + "Wolfs=" + wolfs + ", clean" + clean + ")";
    }

    public void sortByWeight(){
        Collections.sort(wolfs, new WolfComparator());
    }

    @Override
    public int countAnimals() {
        return wolfs.size();
    }

    public Wolf takeOffAnimal() {
        if (wolfs == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(wolfs.size());
            return (Wolf) wolfs.remove(i);
        }
    }
}