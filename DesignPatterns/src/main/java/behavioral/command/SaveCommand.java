package behavioral.command;

public class SaveCommand implements Command {
    WordDocument wordDocument;

    public SaveCommand(WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    public String execute() {
        return wordDocument.save();
    }
}
