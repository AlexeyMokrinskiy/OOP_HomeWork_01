package final_project.terminal.terminalMessages;

public class HelloMessage extends Message{

    public HelloMessage() {
        this.message = "input action\n " +
                "Format:\n <animal> del or\n " +
                "<animal> add <name birth_year weight extra_number>\n" +
                "              (maneVolume, height, bodyLength, etc.)";
    }
}