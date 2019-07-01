package behavioral.state;

public class CloseAndUnlockState implements DootState {

        public String openDoor() {
            return "You have successfully opened the door";
        }

        public String closeDoor() {
            return "You have no ability to close, because they are already closed and unlocked";
        }

        public String lockDoor() {
            return "You have successfully locked the door";
        }

        public String unlockDoor() {
            return "You have no ability to unlock, because they are already unlocked and closed";
        }

}
