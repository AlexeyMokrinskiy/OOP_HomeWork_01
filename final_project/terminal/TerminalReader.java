package final_project.terminal;

import java.util.Scanner;
import final_project.terminal.terminalMessages.ErrorMessage;
import final_project.terminal.terminalMessages.HelloMessage;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final_project.zoo.Zoo zoo;

    public void setZoo(final_project.zoo.Zoo zoo) {
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

    private void setCommandExecutable(Command input) {
        this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(input);
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