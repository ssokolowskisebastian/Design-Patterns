package behavioral.command;

public class MenuDocument {
    Command saveCommand;
    Command openCommand;
    Command closeCommand;

    public MenuDocument(Command saveCommand, Command openCommand, Command closeCommand) {
        this.saveCommand = saveCommand;
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }
    String clickOpen(){
        return openCommand.execute();
    }

    String clickClose(){
        return closeCommand.execute();
    }

    String clickSave(){
        return saveCommand.execute();
    }
}
