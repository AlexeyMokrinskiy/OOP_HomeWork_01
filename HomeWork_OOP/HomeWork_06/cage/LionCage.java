package HomeWork_OOP.HomeWork_06.cage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import HomeWork_OOP.HomeWork_06.animals.Lion;
import HomeWork_OOP.HomeWork_06.comparators.LionComparator;

public class LionCage implements AnimalCage<Lion> {

    private int clean;
    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions) {
        lions = new ArrayList<Lion>();
    }

    public Lion getAnimal() {
        int randomAnimal = (int) ((Math.random()) * lions.size());
        if (lions.size() == 0) {
            System.out.println("The cage is empty");
        } else {
            lions.get(randomAnimal);
            System.out.println(lions.toString());
        }
        return null;
        
    }

    @Override
    public int addAnimal(Lion animal) {
        lions.add((Lion) animal);
        return lions.size();
    }

    @Override
    public int delyverFeed(int weightOfFood) {
        int animalPortion = weightOfFood / lions.size();
        for (Lion lion : lions) {
            if (lion.feed(weightOfFood)) {
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
        return "LionCage(" + "Lions=" + lions + ", clean" + clean + ")";
    }

    public ArrayList<Lion> getLions(){
        return lions;
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    public void SortByManeVolume(){
        Collections.sort(lions, new LionComparator());
    }

    @Override
    public int countAnimals() {
        return lions.size();
    }

    public Lion takeOffAnimal() {
        if (lions == null) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(lions.size());
            return (Lion) lions.remove(i);
        }
    }
    
}
