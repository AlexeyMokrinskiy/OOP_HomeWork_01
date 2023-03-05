package HomeWork_OOP.HomeWork_06.terminal.animalActionExecutable;

import HomeWork_OOP.HomeWork_06.terminal.Command;
import HomeWork_OOP.HomeWork_06.terminal.CommandExecutable;
import HomeWork_OOP.HomeWork_06.zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public DeleteWolfExecutable() {

    }

    public DeleteWolfExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteWolfExecutable(zoo);
    }

    @Override
    public void execute() {
        this.zoo.takeOfWolf();
    }
}