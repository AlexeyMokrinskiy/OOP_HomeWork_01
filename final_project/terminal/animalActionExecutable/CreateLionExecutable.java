package final_project.terminal.animalActionExecutable;

import java.util.ArrayList;
import final_project.animals.Lion;
import final_project.terminal.Command;
import final_project.terminal.CommandExecutable;
import final_project.zoo.Zoo;



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
