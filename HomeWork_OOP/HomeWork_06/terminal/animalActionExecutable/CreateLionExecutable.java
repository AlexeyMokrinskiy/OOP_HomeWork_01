package HomeWork_OOP.HomeWork_06.terminal.animalActionExecutable;

import java.util.ArrayList;
import HomeWork_OOP.HomeWork_06.animals.Lion;
import HomeWork_OOP.HomeWork_06.terminal.Command;
import HomeWork_OOP.HomeWork_06.terminal.CommandExecutable;
import HomeWork_OOP.HomeWork_06.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.lion = new Lion(input.get(0), Integer.parseInt(input.get(1)),
                Integer.parseInt(input.get(2)), 4, Integer.parseInt(input.get(3)));
    }

    public CreateLionExecutable() {

    }

    public CreateLionExecutable getZoo(Zoo zoo, Command command) {
        return new CreateLionExecutable(zoo, command);
    }

    @Override
    public void execute() {
        this.zoo.addLion(lion);
    }

}
