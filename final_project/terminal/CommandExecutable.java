package final_project.terminal;

import final_project.zoo.Zoo;

public interface CommandExecutable {
    void execute();

    CommandExecutable getZoo(Zoo zoo, Command command);

}
