package behavioral.state;

public class CloseAndLockState implements DootState {
    public String openDoor() {
        return "You have no ability to open, because they are already locked";
    }

    public String closeDoor() {
        return "You have no ability to close, because they are already closed";
    }

    public String lockDoor() {

        return "You have no ability to lock, because they are already locked";
    }

    public String unlockDoor() {
        return "You have successfully unlocked the door";
    }
}
