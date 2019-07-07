package behavioral.chainOfResponsibility;

public abstract class Employee {
    Employee supervisor;
    void setNextSupervisor(Employee supervisor){
        this.supervisor=supervisor;
    }
    public abstract void applyLeave(String employeeName, int numberOfDaysLeave);
}
