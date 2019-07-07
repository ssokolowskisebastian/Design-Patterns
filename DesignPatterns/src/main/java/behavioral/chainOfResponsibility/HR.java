package behavioral.chainOfResponsibility;

public class HR extends Employee {
    static final String emploeeTitle="HR";
    final int MAX_LEAVE_CAN_APPROVE=30;
    @Override
    public void applyLeave(String employeeName, int numberOfDaysLeave) {
        if(numberOfDaysLeave<=MAX_LEAVE_CAN_APPROVE){
            approveLeave(employeeName,numberOfDaysLeave);
        }else{
            System.out.println("Nie możesz wziąć więcej niż 30 dni");
        }
    }
    void approveLeave(String employeeName, int numberOfDaysLeave){
        System.out.println("Employee "+ employeeName+" gets "+ numberOfDaysLeave+" days from "+emploeeTitle);
    }
}
