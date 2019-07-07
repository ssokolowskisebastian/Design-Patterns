package behavioral.command2;

public class Developer {
    Command insertCommand;
    Command deleteCommand;
    Command selectCommand;

    public Developer(Command insertCommand, Command deleteCommand, Command selectCommand) {
        this.insertCommand = insertCommand;
        this.deleteCommand = deleteCommand;
        this.selectCommand = selectCommand;
    }


    String insertRecord(){
        return insertCommand.execute();
    }
    String deleteRecord(){
        return deleteCommand.execute();
    }
    String selectRecord(){
        return selectCommand.execute();
    }

}
