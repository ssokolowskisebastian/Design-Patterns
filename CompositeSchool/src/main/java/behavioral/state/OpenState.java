package behavioral.state;

public class OpenState implements DootState {
    public String openDoor() {
        return "You have no ability to open, because they are already open";
    }

    public String closeDoor() {
        return "You have successfully closed the door";
    }

    public String lockDoor() {
        return "You have no ability to lock, because they are already open";
    }

    public String unlockDoor() {
        return "You have no ability to unlock, because they are already open";
    }
}
