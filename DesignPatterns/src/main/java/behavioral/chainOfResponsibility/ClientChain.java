package behavioral.chainOfResponsibility;

public class ClientChain {
    public static void main(String[] args) {
        TeamLeader teamLeader=new TeamLeader();
        ProjectManager projectManager=new ProjectManager();
        HR hr=new HR();

        teamLeader.setNextSupervisor(projectManager);
        projectManager.setNextSupervisor(hr);

        teamLeader.applyLeave("David",13);
        teamLeader.applyLeave("David2",23);
        teamLeader.applyLeave("David3",33);
        teamLeader.applyLeave("David4",3);
    }
}
