package metroGrafo;

import java.util.HashMap;
import java.util.Map;

public class MapMetro {
    Map<String, Station> estacoes;

    //Construtor
    public MapMetro() {
        estacoes = new HashMap<>();
    }

    //Adiciona as estações
    public void adicionarEstacao(String nome) {
        estacoes.put(nome, new Station(nome));
    }

    //Adiciona as conexões
    public void adicionarConexao(String nome1, String nome2, int tempo) {
        Station est1 = estacoes.get(nome1);
        Station est2 = estacoes.get(nome2);
        if (est1 == null || est2 == null) {
            throw new IllegalArgumentException(" --> Estação não encontrada <--");
        }
        est1.addConnection(est2, tempo);
        est2.addConnection(est1, tempo); // Se o grafo for bidirecional
    }

    //Pega as estações
    public Station getEstacao(String nome) {
        return estacoes.get(nome);
    }
}

