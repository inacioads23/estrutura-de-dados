package metroGrafo;

import java.util.Scanner;

public class AddStationConnection {

	public void stationConnection() {
		MapMetro mapa = new MapMetro(); //Instancia a [Class MapMetro]
		MenuAndOptions menu = new MenuAndOptions(); //Instancia a [Class MenuAndOptions]

		String origemNome, destinoNome;
		Scanner ler = new Scanner(System.in);

		/* Adicionando estações */
		// linha 1 - Azul
		mapa.adicionarEstacao("Tucuruvi"); // 1
		mapa.adicionarEstacao("Parada Inglesa"); // 2
		mapa.adicionarEstacao("Jardim São Paulo-Ayrton Senna"); // 3
		mapa.adicionarEstacao("Santana"); // 4
		mapa.adicionarEstacao("Carandiru"); // 5
		mapa.adicionarEstacao("Portuguesa-Tietê"); // 6
		mapa.adicionarEstacao("Armênia"); // 7
		mapa.adicionarEstacao("Tiradentes"); // 8
		mapa.adicionarEstacao("Luz"); // 9
		mapa.adicionarEstacao("São Bento"); // 10
		mapa.adicionarEstacao("Sé"); // 11
		mapa.adicionarEstacao("Japão-Liberdade"); // 12
		mapa.adicionarEstacao("São Joaquim"); // 13
		mapa.adicionarEstacao("Vergueiro"); // 14
		mapa.adicionarEstacao("Paraíso"); // 15
		mapa.adicionarEstacao("Ana Rosa"); // 16
		mapa.adicionarEstacao("Vila Mariana"); // 17
		mapa.adicionarEstacao("Santa Cruz"); // 18
		mapa.adicionarEstacao("Praça da Árvore"); // 19
		mapa.adicionarEstacao("Saúde"); // 20
		mapa.adicionarEstacao("São Judas"); // 21
		mapa.adicionarEstacao("Conceição"); // 22
		mapa.adicionarEstacao("Jabaquara"); // 23
		// linha 2 - Verde
		mapa.adicionarEstacao("Vila Madalena"); // 24
		mapa.adicionarEstacao("Sumaré"); // 25
		mapa.adicionarEstacao("Clínicas"); // 26
		mapa.adicionarEstacao("Consolação-Paulista"); // 27
		mapa.adicionarEstacao("Trianon-Masp"); // 28
		mapa.adicionarEstacao("Brigadeiro"); // 29
		mapa.adicionarEstacao("Paraíso"); // 15
		mapa.adicionarEstacao("Ana Rosa"); // 16
		mapa.adicionarEstacao("Chácara Klabin"); // 30
		mapa.adicionarEstacao("Santos-Imigrantes"); // 31
		mapa.adicionarEstacao("Alto do Ipiranga"); // 32
		mapa.adicionarEstacao("Sacomã"); // 33
		mapa.adicionarEstacao("Tamanduateí"); // 34
		mapa.adicionarEstacao("Vila Prudente"); // 35
		// linha 3 - Vermelha
		mapa.adicionarEstacao("Palmeiras-Barra Funda"); // 36
		mapa.adicionarEstacao("Marechal Deodoro"); // 37
		mapa.adicionarEstacao("Santa Cecília"); // 38
		mapa.adicionarEstacao("República"); // 39
		mapa.adicionarEstacao("Anhangabaú"); // 40
		mapa.adicionarEstacao("Sé"); // 11
		mapa.adicionarEstacao("Pedro II"); // 41
		mapa.adicionarEstacao("Brás"); // 42
		mapa.adicionarEstacao("Bresser-Mooca"); // 43
		mapa.adicionarEstacao("Belém"); // 44
		mapa.adicionarEstacao("Tatuapé"); // 45
		mapa.adicionarEstacao("Carrão"); // 46
		mapa.adicionarEstacao("Penha"); // 47
		mapa.adicionarEstacao("Vila Matilde"); // 48
		mapa.adicionarEstacao("Guilhermina-Esperança"); // 49
		mapa.adicionarEstacao("Patriarca-Vila Ré"); // 50
		mapa.adicionarEstacao("Artur Alvim"); // 51
		mapa.adicionarEstacao("Corinthians-Itaquera"); // 52
		// linha 4 - Amarela
		mapa.adicionarEstacao("Vila Sônia"); // 53
		mapa.adicionarEstacao("São Paulo-Morumbi"); // 54
		mapa.adicionarEstacao("Butantã"); // 55
		mapa.adicionarEstacao("Pinheiros"); // 56
		mapa.adicionarEstacao("Faria Lima"); // 57
		mapa.adicionarEstacao("Fradique Coutinho"); // 58
		mapa.adicionarEstacao("Oscar Freire"); // 59
		mapa.adicionarEstacao("Consolação-Paulista"); // 27
		mapa.adicionarEstacao("Higienópolis-Mackenzie"); // 60
		mapa.adicionarEstacao("República"); // 39
		mapa.adicionarEstacao("Luz"); // 9
		// linha 5 - Lilás
		mapa.adicionarEstacao("Capão Redondo"); // 61
		mapa.adicionarEstacao("Campo Lindo"); // 62
		mapa.adicionarEstacao("Vila das Belezas"); // 63
		mapa.adicionarEstacao("Giovanni Gronchi"); // 64
		mapa.adicionarEstacao("Santo Amaro"); // 65
		mapa.adicionarEstacao("Largo Treze"); // 66
		mapa.adicionarEstacao("Adolfo Pinheiro"); // 67
		mapa.adicionarEstacao("Alto da Boa Vista"); // 68
		mapa.adicionarEstacao("Borba Gato"); // 69
		mapa.adicionarEstacao("Brooklin"); // 70
		mapa.adicionarEstacao("Campo Belo"); // 71
		mapa.adicionarEstacao("Eucaliptos"); // 72
		mapa.adicionarEstacao("Moema"); // 73
		mapa.adicionarEstacao("AACD-Servidor"); // 74
		mapa.adicionarEstacao("Hospital São Paulo"); // 75
		mapa.adicionarEstacao("Santa Cruz"); // 18
		mapa.adicionarEstacao("Chácara Klabin"); // 30

	
		/* Adicionando conexões com tempos de viagem */
		// linha 1 - Azul
		mapa.adicionarConexao("Tucuruvi", "Parada Inglesa", 2);
		mapa.adicionarConexao("Parada Inglesa", "Jardim São Paulo-Ayrton Senna", 2);
		mapa.adicionarConexao("Jardim São Paulo-Ayrton Senna", "Santana", 2);
		mapa.adicionarConexao("Santana", "Carandiru", 1);
		mapa.adicionarConexao("Carandiru", "Portuguesa-Tietê", 2);
		mapa.adicionarConexao("Portuguesa-Tietê", "Armênia", 2);
		mapa.adicionarConexao("Armênia", "Tiradentes", 2);
		mapa.adicionarConexao("Tiradentes", "Luz", 2);
		mapa.adicionarConexao("Luz", "São Bento", 2);
		mapa.adicionarConexao("São Bento", "Sé", 1);
		mapa.adicionarConexao("Sé", "Japão-Liberdade", 2);
		mapa.adicionarConexao("Japão-Liberdade", "São Joaquim", 2);
		mapa.adicionarConexao("São Joaquim", "Vergueiro", 2);
		mapa.adicionarConexao("Vergueiro", "Paraíso", 2);
		mapa.adicionarConexao("Paraíso", "Ana Rosa", 1);
		mapa.adicionarConexao("Ana Rosa", "Vila Mariana", 2);
		mapa.adicionarConexao("Vila Mariana", "Santa Cruz", 2);
		mapa.adicionarConexao("Santa Cruz", "Praça da Árvore", 2);
		mapa.adicionarConexao("Praça da Árvore", "Saúde", 1);
		mapa.adicionarConexao("Saúde", "São Judas", 2);
		mapa.adicionarConexao("São Judas", "Conceição", 2);
		mapa.adicionarConexao("Conceição", "Jabaquara", 2);
		// linha 2 - Verde
		mapa.adicionarConexao("Vila Madalena", "Sumaré", 2);
		mapa.adicionarConexao("Sumaré", "Clínicas", 2);
		mapa.adicionarConexao("Clínicas", "Consolação-Paulista", 2);
		mapa.adicionarConexao("Consolação-Paulista", "Trianon-Masp", 2);
		mapa.adicionarConexao("Trianon-Masp", "Brigadeiro", 2);
		mapa.adicionarConexao("Brigadeiro", "Paraíso", 2);
		mapa.adicionarConexao("Paraíso", "Ana Rosa", 1);
		mapa.adicionarConexao("Ana Rosa", "Chácara Klabin", 2);
		mapa.adicionarConexao("Chácara Klabin", "Santos-Imigrantes", 2);
		mapa.adicionarConexao("Santos-Imigrantes", "Alto do Ipiranga", 2);
		mapa.adicionarConexao("Alto do Ipiranga", "Sacomã", 2);
		mapa.adicionarConexao("Sacomã", "Tamanduateí", 2);
		mapa.adicionarConexao("Tamanduateí", "Vila Prudente", 2);
		// linha 3 - Vermelha
		mapa.adicionarConexao("Palmeiras-Barra Funda", "Marechal Deodoro", 2);
		mapa.adicionarConexao("Marechal Deodoro", "Santa Cecília", 2);
		mapa.adicionarConexao("Santa Cecília", "República", 2);
		mapa.adicionarConexao("República", "Anhangabaú", 2);
		mapa.adicionarConexao("Anhangabaú", "Sé", 2);
		mapa.adicionarConexao("Sé", "Pedro II", 2);
		mapa.adicionarConexao("Pedro II", "Brás", 2);
		mapa.adicionarConexao("Brás", "Bresser-Mooca", 2);
		mapa.adicionarConexao("Bresser-Mooca", "Belém", 2);
		mapa.adicionarConexao("Belém", "Tatuapé", 2);
		mapa.adicionarConexao("Tatuapé", "Carrão", 2);
		mapa.adicionarConexao("Carrão", "Penha", 2);
		mapa.adicionarConexao("Penha", "Vila Matilde", 2);
		mapa.adicionarConexao("Vila Matilde", "Guilhermina-Esperança", 2);
		mapa.adicionarConexao("Guilhermina-Esperança", "Patriarca-Vila Ré", 2);
		mapa.adicionarConexao("Patriarca-Vila Ré", "Artur Alvim", 2);
		mapa.adicionarConexao("Artur Alvim", "Corinthians-Itaquera", 2);
		// linha 4 - Amarela
		mapa.adicionarConexao("Vila Sônia", "São Paulo-Morumbi", 2);
		mapa.adicionarConexao("São Paulo-Morumbi", "Butantã", 2);
		mapa.adicionarConexao("Butantã", "Pinheiros", 1);
		mapa.adicionarConexao("Pinheiros", "Faria Lima", 2);
		mapa.adicionarConexao("Faria Lima", "Fradique Coutinho", 2);
		mapa.adicionarConexao("Fradique Coutinho", "Oscar Freire", 2);
		mapa.adicionarConexao("Oscar Freire", "Consolação-Paulista", 2);
		mapa.adicionarConexao("Consolação-Paulista", "Higienópolis-Mackenzie", 2);
		mapa.adicionarConexao("Higienópolis-Mackenzie", "República", 2);
		mapa.adicionarConexao("República", "Luz", 3);
		// linha 5 - Lilás	
		mapa.adicionarConexao("Capão Redondo", "Campo Lindo", 2);
		mapa.adicionarConexao("Campo Lindo", "Vila das Belezas", 3);
		mapa.adicionarConexao("Vila das Belezas", "Giovanni Gronchi", 3);
		mapa.adicionarConexao("Giovanni Gronchi", "Santo Amaro", 3);
		mapa.adicionarConexao("Santo Amaro", "Largo Treze", 2);
		mapa.adicionarConexao("Largo Treze", "Adolfo Pinheiro", 2);
		mapa.adicionarConexao("Adolfo Pinheiro", "Alto da Boa Vista", 2);
		mapa.adicionarConexao("Alto da Boa Vista", "Borba Gato", 2);
		mapa.adicionarConexao("Borba Gato", "Brooklin", 1);
		mapa.adicionarConexao("Brooklin", "Campo Belo", 2);
		mapa.adicionarConexao("Campo Belo", "Eucaliptos", 2);
		mapa.adicionarConexao("Eucaliptos", "Moema", 2);
		mapa.adicionarConexao("Moema", "AACD-Servidor", 2);
		mapa.adicionarConexao("AACD-Servidor", "Hospital São Paulo", 1);
		mapa.adicionarConexao("Hospital São Paulo", "Santa Cruz", 2);
		mapa.adicionarConexao("Santa Cruz", "Chácara Klabin", 2);

		
		// Leitura da estação de origem
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("Digite a estação de origem: ");
		origemNome = ler.nextLine();
		Station origem = mapa.getEstacao(origemNome);

		// Leitura da estação de destino
		System.out.print("Digite a estação de destino: ");
		destinoNome = ler.nextLine();
		Station destino = mapa.getEstacao(destinoNome);
		
		
		try {
			// Usando a [Class Dijkstra] para encontrar a rota mais rápida
			ResultPath resultado = Dijkstra.encontrarMenorCaminho(mapa, origem, destino);

			// Exibindo as estações percorridas e o tempo de viagem 
			System.out.println("\n==> MELHOR CAMINHO <==");
			System.out.println("Percurso: ");
			for (Station estacao : resultado.getRota()) {
				System.out.println("-> " + estacao.nome);
			}
			System.out.println("\nTempo de viagem de " + origem.nome + " até " + destino.nome + ": "
					+ resultado.getCustoTotal() + " minutos");
			menu.menu();
			menu.newQuery();
			
			//Tratamento de erro
		} catch (java.lang.NullPointerException e) {
			System.out.println("\n--> Verifique se não há erro na digitação. Ou se a estação existe <--");
			menu.newQuery();
		}
		ler.close();
	}
}
