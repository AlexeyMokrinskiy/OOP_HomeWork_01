package HomeWork_OOP.HomeWork_06.terminal;

import HomeWork_OOP.HomeWork_06.zoo.Zoo;

public interface CommandExecutable {
    void execute();

    CommandExecutable getZoo(Zoo zoo, Command command);
}
