package metroGrafo;

import java.util.HashMap;
import java.util.Map;

class Station {
    String nome;
    Map<Station, Integer> conexoes; // Tempo de viagem em minutos

    // Constutor para as Estações 
    public Station(String nome) {
        this.nome = nome;
        this.conexoes = new HashMap<>();
    }

    // Método que adiciona as Conexões
    public void addConnection(Station estacao, int tempo) {
        conexoes.put(estacao, tempo);
    }
}

