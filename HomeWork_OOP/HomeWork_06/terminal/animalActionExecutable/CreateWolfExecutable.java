package HomeWork_OOP.HomeWork_06.terminal.animalActionExecutable;

import java.util.ArrayList;
import HomeWork_OOP.HomeWork_06.animals.Wolf;
import HomeWork_OOP.HomeWork_06.terminal.Command;
import HomeWork_OOP.HomeWork_06.terminal.CommandExecutable;
import HomeWork_OOP.HomeWork_06.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {

    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.wolf = new Wolf(input.get(0), Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)), 0,
                Integer.parseInt(input.get(3)));
    }

    public CreateWolfExecutable() {

    }


    public CreateWolfExecutable getZoo(Zoo zoo, Command command) {
        return new CreateWolfExecutable(zoo, command);
    }


    @Override
    public void execute() {
        this.zoo.addWolf(wolf);
    }
}
