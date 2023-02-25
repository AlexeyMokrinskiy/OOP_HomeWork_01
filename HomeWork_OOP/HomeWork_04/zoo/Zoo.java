package HomeWork_OOP.HomeWork_04.zoo;

import HomeWork_OOP.HomeWork_04.animals.Lion;
import HomeWork_OOP.HomeWork_04.animals.Snake;
import HomeWork_OOP.HomeWork_04.animals.Wolf;
import HomeWork_OOP.HomeWork_04.cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snaktCage;

    public AnimalCage<Wolf> getwolfCage() {
        return wolfCage;
    }
    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }
    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Snake> getSnaktCage() {
        return snaktCage;
    }
    public void setSnaktCage(AnimalCage<Snake> snaktCage) {
        this.snaktCage = snaktCage;
    }
}