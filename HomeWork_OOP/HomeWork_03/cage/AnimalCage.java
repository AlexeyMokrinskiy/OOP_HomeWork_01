package HomeWork_OOP.HomeWork_03.cage;

import HomeWork_OOP.HomeWork_03.animals.Animal;

public interface AnimalCage {

    int addAnimal(Animal animal);

    int delyverFeed(int weightOfFood);

    boolean cleanCage();

    void getAnimal();
}
