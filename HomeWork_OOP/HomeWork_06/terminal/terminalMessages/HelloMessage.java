package HomeWork_OOP.HomeWork_06.terminal.terminalMessages;

public class HelloMessage extends Message{

    public HelloMessage() {
        this.message = "input what you want\n " +
                "Format:\n <type of animal> delete or\n " +
                "<type of animal> create\nthen: name year_of_birth weight extra_number" +
                "(maneVolume, height, bodyLength etc.)";
    }
}