package behavioral.chainOfResponsibility;

public class ProjectManager extends Employee {

    static final String emploeeTitle="PROJECT LEADER";
    final int MAX_LEAVE_CAN_APPROVE=20;
    @Override
    public void applyLeave(String employeeName, int numberOfDaysLeave) {
        if(numberOfDaysLeave<=MAX_LEAVE_CAN_APPROVE){
            approveLeave(employeeName,numberOfDaysLeave);
        }else{
            supervisor.applyLeave(employeeName,numberOfDaysLeave);
        }
    }

    void approveLeave(String employeeName, int numberOfDaysLeave){
        System.out.println("Employee "+ employeeName+" gets "+ numberOfDaysLeave+" days from "+emploeeTitle);
    }
}
