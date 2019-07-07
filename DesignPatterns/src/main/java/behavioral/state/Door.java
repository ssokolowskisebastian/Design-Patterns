package behavioral.state;

public class Door implements DootState{
    DootState dootState;

    public DootState getDootState() {
        return dootState;
    }

    public void setDootState(DootState dootState) {
        this.dootState = dootState;
    }


    public String openDoor() {
        String a=dootState.openDoor();

        if(dootState instanceof CloseAndUnlockState)
            setDootState(new OpenState());
        return a;
    }

    public String closeDoor() {
        String a=dootState.closeDoor();
        if(dootState instanceof OpenState)
            setDootState(new CloseAndUnlockState());
        return a;
    }

    public String lockDoor() {
        String a=dootState.lockDoor();
        if(dootState instanceof CloseAndUnlockState)
            setDootState(new CloseAndLockState());

        return a;
    }

    public String unlockDoor() {
         String a=dootState.unlockDoor();

        if(dootState instanceof CloseAndLockState)
            setDootState(new CloseAndUnlockState());

        return a;


    }
}
