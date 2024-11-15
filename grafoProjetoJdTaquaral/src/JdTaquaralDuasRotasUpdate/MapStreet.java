package JdTaquaralDuasRotasUpdate;

import java.util.HashMap;
import java.util.Map;

public class MapStreet {
    Map<String, Point> points;

    public MapStreet() {
        points = new HashMap<>();
    }

    public void addStreet(String name) {
        points.put(name, new Point(name));
    }

    public void addConnection(String name1, String name2, int time) {
        Point street1 = points.get(name1);
        Point street2 = points.get(name2);
        if (street1 == null || street2 == null) {
            throw new IllegalArgumentException(" --> Ponto não encontrado <--");
        }
        street1.addConnection(street2, time);
        street2.addConnection(street1, time);
    }

    public Point getStreet(String name) {
        Point point = points.get(name);
        if (point == null) {
            System.out.println("--> Erro: Ponto " + name + " não encontrado <-- ");
        }
        return point;
    }
}

