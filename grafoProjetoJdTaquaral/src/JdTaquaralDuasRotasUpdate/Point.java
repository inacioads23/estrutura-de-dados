package JdTaquaralDuasRotasUpdate;

import java.util.ArrayList;
import java.util.List;

class Point {
    String name;
    List<Connection> connections;

    public Point(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public void addConnection(Point point, int time) {
        connections.add(new Connection(point, time));
    }

    public static class Connection {
        Point point;
        int time;

        public Connection(Point point, int time) {
            this.point = point;
            this.time = time;
        }
    }
}

