package behavioral.command2;

public class InsertCommand implements Command{

    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    public String execute() {
        return database.insert();
    }
}
