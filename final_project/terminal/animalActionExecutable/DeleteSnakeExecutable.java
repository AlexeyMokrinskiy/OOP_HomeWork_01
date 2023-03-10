package final_project.terminal.animalActionExecutable;

import final_project.terminal.Command;
import final_project.terminal.CommandExecutable;
import final_project.zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public DeleteSnakeExecutable() {

    }

    public  DeleteSnakeExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteSnakeExecutable(zoo);
    }


    @Override
    public void execute() {
        this.zoo.takeOfSnake();
    }
}
