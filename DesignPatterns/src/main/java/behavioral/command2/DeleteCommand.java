package behavioral.command2;

public class DeleteCommand implements Command {

    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    public String execute() {
        return database.delete();
    }
}
