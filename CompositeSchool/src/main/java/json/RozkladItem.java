package json;

import java.util.List;

public class RozkladItem {
    int line;
    List<String> departures;
    String busStopName;

    public RozkladItem(int line, List<String> departures, String busStopName) {
        this.line = line;
        this.departures = departures;
        this.busStopName = busStopName;
    }
}
