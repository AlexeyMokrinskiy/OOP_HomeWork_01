package final_project.terminal.animalActionExecutable;

import final_project.terminal.Command;
import final_project.terminal.CommandExecutable;
import final_project.zoo.Zoo;

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