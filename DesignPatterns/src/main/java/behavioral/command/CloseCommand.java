package behavioral.command;

public class CloseCommand implements Command {
    WordDocument wordDocument;

    public CloseCommand(WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    public String execute() {
        return wordDocument.close();
    }
}
