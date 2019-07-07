package behavioral.command2;

public class ClientCommand2 {



    public static void main(String[] args) {
        Database database=new Database();
        Command insertCommand=new InsertCommand(database);
        Command deleteCommand=new DeleteCommand(database);
        Command selectCommand=new SelectCommand(database);

        Developer developer=new Developer(insertCommand,deleteCommand,selectCommand);
        System.out.println(developer.deleteRecord());


    }
}
