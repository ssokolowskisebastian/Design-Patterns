package structural.compositeDeveloper;

public class ClientComposite {

    public static void main(String[] args) {

        Department department=new Department();
        department.setDepartmentName("Departmant");

        Team team=new Team();
        team.setTeamName("TEAM");

        Developer developer=new JavaDeveloper();
        ((JavaDeveloper) developer).setDeveloperName("Developer");
        Developer developer1=new JavaDeveloper();
        ((JavaDeveloper) developer1).setDeveloperName("Developer1");

        Developer developer2=new CppDeveloper();
        ((CppDeveloper) developer2).setDeveloperName("Developer2");
        Developer developer3=new CppDeveloper();
        ((CppDeveloper) developer3).setDeveloperName("Developer3");

        department.teams.add(team);
        department.showTeams();

        team.developers.add(developer);
        team.developers.add(developer1);
        team.developers.add(developer2);
        team.developers.add(developer3);

        team.createProject();








    }
}
