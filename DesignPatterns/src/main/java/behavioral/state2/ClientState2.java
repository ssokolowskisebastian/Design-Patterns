package behavioral.state2;

public class ClientState2 {


    public static void main(String [] args){
        Developer developer=new Developer();
        Activity activity=new Sleeping();
        developer.setActivity(activity);


        for (int i=0;i<6;i++){

            System.out.println(developer.doActivity());
            developer.changeActivity();

        }


    }

}
