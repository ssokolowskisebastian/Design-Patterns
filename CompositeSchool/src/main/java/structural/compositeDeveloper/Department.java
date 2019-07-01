package structural.compositeDeveloper;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String departmentName;

    List<Team> teams=new ArrayList<Team>();

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    void showTeams(){
        System.out.println("Department: "+this.departmentName);

        for(Team t:teams){
            System.out.println(t.teamName);
        }
    }
}
