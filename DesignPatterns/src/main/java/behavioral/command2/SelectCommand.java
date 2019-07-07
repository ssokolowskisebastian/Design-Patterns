package behavioral.command2;

public class SelectCommand implements Command{
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    public String execute() {
        return database.select();
    }
}
