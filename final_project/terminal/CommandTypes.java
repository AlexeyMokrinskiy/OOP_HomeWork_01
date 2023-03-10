package final_project.terminal;

import final_project.terminal.animalActionExecutable.CreateLionExecutable;
import final_project.terminal.animalActionExecutable.CreateSnakeExecutable;
import final_project.terminal.animalActionExecutable.CreateWolfExecutable;
import final_project.terminal.animalActionExecutable.DeleteLionExecutable;
import final_project.terminal.animalActionExecutable.DeleteSnakeExecutable;
import final_project.terminal.animalActionExecutable.DeleteWolfExecutable;

public enum CommandTypes {
    WOLF_DELETE("wolfdel", 2, new DeleteWolfExecutable()),
    WOLF_CREATE("wolfadd", 6, new CreateWolfExecutable()),
    SNAKE_DELETE("snakedel", 2, new DeleteSnakeExecutable()),
    SNAKE_CREATE("snakeadd", 6, new CreateSnakeExecutable()),
    LION_DELETE("liondel", 2, new DeleteLionExecutable()),
    LION_CREATE("lionadd", 6 , new CreateLionExecutable()),
    ;


    private final String title;

    private final int args;

    private CommandExecutable method;

    CommandTypes(String connand, int i, CommandExecutable method) {
        this.title = connand;
        this.args = i;
        this.method = method;
    }

    public String getTitle() {
        return title;
    }

    public int getArgs() {
        return args;
    }

    public CommandExecutable getMethod() {
        return method;
    }

    public boolean checkType(String animal, String action){
        return title.equals(animal + action);
    }
}