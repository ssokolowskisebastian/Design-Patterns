package behavioral.command;

public class ClientCommand {
    public static void main(String[] args) {
        WordDocument wordDocument=new WordDocument();
        Command saveCommand=new SaveCommand(wordDocument);
        Command openCommand=new OpenCommand(wordDocument);
        Command closeCommand=new CloseCommand(wordDocument);

        MenuDocument menuDocument=new MenuDocument(saveCommand,openCommand,closeCommand);
        System.out.println(menuDocument.clickClose());
        System.out.println(menuDocument.clickOpen());
        System.out.println(menuDocument.clickSave());
    }
}
