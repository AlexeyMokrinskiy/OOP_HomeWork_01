package final_project.terminal.animalActionExecutable;

import java.util.ArrayList;

import final_project.animals.Wolf;
import final_project.terminal.Command;
import final_project.terminal.CommandExecutable;
import final_project.zoo.Zoo;


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
