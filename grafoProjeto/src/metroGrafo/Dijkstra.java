package metroGrafo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class Dijkstra {
	//Encontra o menor caminho analisando toda a rota
	public static ResultPath encontrarMenorCaminho(MapMetro mapa, Station origem, Station destino) {
		Map<Station, Integer> distancias = new HashMap<>();
		Map<Station, Station> antecessores = new HashMap<>();
		Set<Station> visitados = new HashSet<>();
		PriorityQueue<Station> pq = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

		for (Station estacao : mapa.estacoes.values()) { //Conexão com a [Class MapMetro]
			distancias.put(estacao, Integer.MAX_VALUE); //INFINITO
		}
		distancias.put(origem, 0); //Adiciona elemento ao Map

		pq.add(origem); //Adiciona a fila de prioridades

		while (!pq.isEmpty()) {
			Station atual = pq.poll();

			if (!visitados.add(atual)) //Verifica os visitados
				continue;

			for (Map.Entry<Station, Integer> conexao : atual.conexoes.entrySet()) { //Conexão com a [Class Station]
				Station vizinho = conexao.getKey();
				int peso = conexao.getValue();
				int novaDistancia = distancias.get(atual) + peso;

				if (novaDistancia < distancias.get(vizinho)) {
					distancias.put(vizinho, novaDistancia); //Descobre o vizinho
					antecessores.put(vizinho, atual); //Define o antecessor
					pq.add(vizinho); //Adiciona o vizinho a fila de prioridades
				}
			}
		}

		//Busca inversa
		List<Station> caminho = new ArrayList<>();
		for (Station at = destino; at != null; at = antecessores.get(at)) {
			caminho.add(at);
		}
		Collections.reverse(caminho); //Busca inversa

		return new ResultPath(caminho, distancias.get(destino)); //Retorna o caminho e distância até o destino
	}
}
