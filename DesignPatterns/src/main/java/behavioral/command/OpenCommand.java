package behavioral.command;

public class OpenCommand implements Command {
    WordDocument wordDocument;

    public OpenCommand(WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    public String execute() {
        return wordDocument.open();
    }
}
