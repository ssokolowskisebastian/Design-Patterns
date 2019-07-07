package behavioral.state2;

public class Developer implements Activity{

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof Sleeping){
           setActivity(new Training());
        }else if(activity instanceof Training){
            setActivity(new Reading());
        }else if(activity instanceof Reading){
            setActivity(new Coding());
        }else if (activity instanceof Coding){
            setActivity(new Sleeping());
        }
    }

    public String doActivity() {
        return activity.doActivity();
    }


}
