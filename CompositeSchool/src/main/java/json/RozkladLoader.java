package json;


import com.google.gson.Gson;

public class RozkladLoader {

    private final Gson gson;
    private final Database database;
    private final RozkladView rozkladView;

    public RozkladLoader(Gson gson, Database database, RozkladView rozkladView) {
        this.gson = gson;
        this.database = database;
        this.rozkladView = rozkladView;
    }

    void loadData() {
        String json = database.getRozkladJson();
        RozkladItem s = deseerializuj(json);
        rozkladView.show(s.line,s.departures,s.busStopName);

    }

    private RozkladItem deseerializuj(String json) {
        return gson.fromJson(json, RozkladItem.class);
    }






}
