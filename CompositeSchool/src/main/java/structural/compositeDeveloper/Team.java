package structural.compositeDeveloper;

import java.util.ArrayList;
import java.util.List;

public class Team {

    String teamName;

    List<Developer> developers=new ArrayList<Developer>();

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    void addDeveloper(Developer d){
        developers.add(d);
    }

    void createProject(){
        System.out.println("Team: "+this.teamName);
        for (Developer d:developers){
            System.out.println(d.writeCode());
        }
    }
}
