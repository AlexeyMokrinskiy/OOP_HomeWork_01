package HomeWork_OOP.HomeWork_06.terminal;

import HomeWork_OOP.HomeWork_06.terminal.terminalMessages.*;
import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private HomeWork_OOP.HomeWork_06.zoo.Zoo zoo;

    public void setZoo(HomeWork_OOP.HomeWork_06.zoo.Zoo zoo) {
        this.zoo = zoo;
    }

    private CommandParser commandParser;

    private CommandExecutable commandExecutable;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private void setCommandExecutable(Command command) {
        this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(command);
    }

    public void endless() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(zoo.toString() + "\n");
            new HelloMessage().consoleMessage();
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            if (Check.isCheck(input)) {
                Command newCommand = this.commandParser.parseCommand(input);
                this.setCommandExecutable(newCommand);
                this.commandExecutable.execute();
            } else {
                new ErrorMessage().consoleMessage();
            }
        }
        scanner.close();
    }


}