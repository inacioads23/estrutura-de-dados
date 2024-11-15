package JdTaquaralDuasRotasUpdate;

import java.util.List;
import java.util.Scanner;

public class AddConnectionPoint {
	private MapStreet map;
	private MenuAndOptions menu;
	private Scanner read;

	public AddConnectionPoint(MenuAndOptions menu) {
		this.map = new MapStreet();
		this.menu = menu;
		this.read = new Scanner(System.in);
	}

	// Método para adicionar as ruas
	public void addStreets() {
		addStreets(new String[][] { { "Q", "R", "S", "V", "A", "B" }, { "B", "C", "D", "E", "F" }, { "E", "G" },
				{ "C", "H", "I", "J", "K" }, { "K", "L", "N", "O", "P", "Q" }, { "L", "M" }, { "R", "T", "U", "X" },
				{ "S", "T" }, { "V", "U" } });
	}

	private void addStreets(String[][] streets) {
		for (String[] streetSet : streets) {
			for (String street : streetSet) {
				map.addStreet(street);
			}
		}
	}

	// Método para adicionar as conexões entre as ruas
	public void addConnections() {
		addConnections(new String[][] { { "Q", "R", "97" }, { "R", "S", "33" }, { "S", "V", "38" }, { "V", "A", "370" },
				{ "A", "B", "300" }, { "B", "C", "47" }, { "C", "D", "62" }, { "D", "E", "8" }, { "E", "F", "13" },
				{ "E", "G", "230" }, { "C", "H", "141" }, { "H", "I", "138" }, { "I", "J", "153" }, { "J", "K", "512" },
				{ "K", "L", "135" }, { "L", "N", "187" }, { "N", "O", "108" }, { "O", "P", "82" }, { "P", "Q", "215" },
				{ "L", "M", "50" }, { "R", "T", "243" }, { "T", "U", "22" }, { "U", "X", "107" }, { "X", "A", "317" },
				{ "S", "T", "207" }, { "V", "U", "210" } });
	}

	private void addConnections(String[][] connections) {
		for (String[] connection : connections) {
			map.addConnection(connection[0], connection[1], Integer.parseInt(connection[2]));
		}
	}

	// Método para calcular o caminho entre as ruas
	public void pointConnection() {
		addStreets(); // Adiciona as ruas
		addConnections(); // Adiciona as conexões

		String originName, destinationName;

		System.out.println("--------------------------------------------------------------------------");
		System.out.print("Digite o ponto de origem: ");
		originName = read.nextLine();
		Point origin = map.getStreet(originName);

		System.out.print("Digite o ponto de destino: ");
		destinationName = read.nextLine();
		Point destination = map.getStreet(destinationName);

		try {
			// Obter duas rotas
			List<ResultPath> twoPaths = Dijkstra.findTwoShortestPaths(map, origin, destination);

			// Exibindo a primeira rota
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("==> MELHOR CAMINHO <==");
			System.out.println("Percurso: ");
			for (Point street : twoPaths.get(0).getRota()) {
				System.out.print("-> " + street.name + " ");
			}
			System.out.println("\n\nTempo de viagem de " + origin.name + " até " + destination.name + ": "
					+ twoPaths.get(0).getTotalCost() + " metros");

			// Verificar se há uma segunda rota
			if (twoPaths.size() > 1) {
				// Exibindo a segunda rota
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("==> SEGUNDO MELHOR CAMINHO <==");
				System.out.println("Percurso: ");
				for (Point street : twoPaths.get(1).getRota()) {
					System.out.print("-> " + street.name + " ");
				}
				System.out.println("\n\nTempo de viagem de " + origin.name + " até " + destination.name + ": "
						+ twoPaths.get(1).getTotalCost() + " metros");
			} else {
				System.out.println("\nNão foi possível calcular uma segunda rota.");
			}

			menu.menu();
			menu.newQuery();

		} catch (java.lang.NullPointerException e) {
			System.out.println("\n--> Verifique se não há erro na digitação. Ou consulte o mapa <--");
			System.out.println("--------------------------------------------------------------------------");
			menu.newQuery();
		}

		read.close();
	}

}
