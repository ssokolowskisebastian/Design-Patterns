package json;

import com.google.gson.Gson;

public class ClientJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Database database = new Database();
        RozkladView rozkladView = new RozkladView();
        RozkladLoader rozkladLoader= new RozkladLoader(gson, database, rozkladView);
        rozkladLoader.loadData();
    }
}
