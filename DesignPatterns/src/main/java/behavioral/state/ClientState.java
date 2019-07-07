package behavioral.state;

public class ClientState {
    public static void main(String[]args){
        Door door1=new Door();
        door1.setDootState(new CloseAndLockState());

        System.out.println(door1.unlockDoor());
        System.out.println(door1.lockDoor());
        System.out.println(door1.unlockDoor());
        System.out.println(door1.openDoor());
        System.out.println(door1.closeDoor());
    }
}
