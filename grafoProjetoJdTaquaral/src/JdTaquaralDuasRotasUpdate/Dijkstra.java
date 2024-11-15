package JdTaquaralDuasRotasUpdate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class Dijkstra {

    // Retorna duas rotas: a melhor e a segunda melhor
    public static List<ResultPath> findTwoShortestPaths(MapStreet map, Point origin, Point destination) {
        // Encontra a melhor rota
        ResultPath firstPath = findShortestPath(map, origin, destination);

        // Verifique se o destino é terminal (sem conexões)
        if (isTerminalPoint(destination)) {
            System.out.println("O destino '" + destination.name + "' é um ponto terminal (sem conexões).");
            // Retorne apenas a primeira rota, já que não há uma segunda rota possível.
            return Arrays.asList(firstPath);
        }

        // Remove o caminho da primeira rota para encontrar a segunda melhor rota
        removePathFromMap(map, firstPath.getRota());

        // Encontra a segunda melhor rota
        ResultPath secondPath = findShortestPath(map, origin, destination);

        // Se não encontrar segunda rota, retorne apenas a primeira
        if (secondPath == null || secondPath.getTotalCost() == Integer.MAX_VALUE) {
            System.out.println("\n--> Não foi possível encontrar uma segunda rota <--");
            return Arrays.asList(firstPath);
        }

        // Retorna ambas as rotas (primeira e segunda)
        return Arrays.asList(firstPath, secondPath);
    }

    // Encontra o menor caminho
    public static ResultPath findShortestPath(MapStreet map, Point origin, Point destination) {
        Map<Point, Integer> distances = new HashMap<>();
        Map<Point, Point> predecessors = new HashMap<>();
        Set<Point> visited = new HashSet<>();
        PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (Point point : map.points.values()) {
            distances.put(point, Integer.MAX_VALUE);
        }
        distances.put(origin, 0);

        pq.add(origin);

        while (!pq.isEmpty()) {
            Point current = pq.poll();
            if (!visited.add(current)) continue;

            for (Point.Connection connection : current.connections) {
                Point neighbor = connection.point;
                int weight = connection.time;
                int newDistance = distances.get(current) + weight;

                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    predecessors.put(neighbor, current);
                    pq.add(neighbor);
                }
            }
        }

        List<Point> path = new ArrayList<>();
        for (Point at = destination; at != null; at = predecessors.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);

        return new ResultPath(path, distances.get(destination));
    }

    // Verifica se o ponto é terminal (sem conexões)
    public static boolean isTerminalPoint(Point point) {
        return point.connections.isEmpty();
    }

    // Remove a rota encontrada do mapa (apenas para encontrar uma rota alternativa)
    private static void removePathFromMap(MapStreet map, List<Point> path) {
        // Remove as conexões da rota encontrada para forçar uma nova rota.
        for (int i = 0; i < path.size() - 1; i++) {
            Point current = path.get(i);
            Point next = path.get(i + 1);

            // Remove a conexão entre o ponto atual e o próximo
            current.connections.removeIf(connection -> connection.point.equals(next));
            next.connections.removeIf(connection -> connection.point.equals(current));
        }
    }
}
