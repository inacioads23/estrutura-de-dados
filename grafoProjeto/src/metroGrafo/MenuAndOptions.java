package metroGrafo;

import java.util.Scanner;

public class MenuAndOptions {
	AddStationConnection add = new AddStationConnection(); //Instancia a Class [AddStationConnection]
	Scanner ler = new Scanner(System.in);
	int opc, opc1;

	//Title Menu
	public void menu() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                              ---> MENU <---                              ");
	}
	
	//Início do Sistema
	public void headerSystem() {
		System.out.println("==========================================================================");
		System.out.println("=               Sistema de Percurso do Metro - Linhas 1 a 5              =");
		System.out.println("=                     Disciplina: Estrutura de Dados                     =");
		System.out.println("=                Desenvolvido por: Inácio, Raissa e Denis                =");
		System.out.println("==========================================================================");
	}

	//Fim do Sistema
	public void footerSystem() {
		System.out.println("                ---> Sistema finalizado com sucesso! <---");
		System.out.println("==========================================================================");
		System.out.println("=                Agradecemos por escolher nosso sistema!                 =");
		System.out.println("==========================================================================");		
		System.exit(0); // sai do sistema
	}

	//Title Menu linhas
	public void headMapaLinhasQuery() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                             ===> LINHAS <===                             ");
		System.out.println("--------------------------------------------------------------------------");
	}

	//Estações da Linha 1
	public void mapLine1() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                            ===> LINHA 1 <===                             ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Tucuruvi                          São Joaquim");
		System.out.println("Parada Inglesa                    Vergueiro");
		System.out.println("Jardim São Paulo-Ayrton Senna     Paraíso");
		System.out.println("Santana                           Ana Rosa");
		System.out.println("Carandiru                         Vila Mariana");
		System.out.println("Portuguesa-Tietê                  Santa Cruz");
		System.out.println("Armênia                           Praça da Árvore");
		System.out.println("Tiradentes                        Saúde");
		System.out.println("Luz                               São Judas");
		System.out.println("São Bento                         Conceição");
		System.out.println("Sé                                Jabaquara");
		System.out.println("Japão-Liberdade");
	}

	//Estações da Linha 2
	public void mapLine2() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                            ===> LINHA 2 <===                             ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Vila Madalena                     Ana Rosa");
		System.out.println("Sumaré                            Chácara Klabin");
		System.out.println("Clínicas                          Santos-Imigrantes");
		System.out.println("Consolação-Paulista               Alto do Ipiranga");
		System.out.println("Trianon-Masp                      Sacomã");
		System.out.println("Brigadeiro                        Tamanduateí");
		System.out.println("Paraíso                           Vila Prudente");
	}

	//Estações da Linha 3
	public void mapLine3() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                            ===> LINHA 3 <===                             ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Palmeiras-Barra Funda             Belém");
		System.out.println("Marechal Deodoro                  Tatuapé");
		System.out.println("Santa Cecília                     Carrão");
		System.out.println("República                         Penha");
		System.out.println("Anhangabaú                        Vila Matilde");
		System.out.println("Sé                                Guilhermina-Esperança");
		System.out.println("Pedro II                          Patriarca-Vila Ré");
		System.out.println("Brás                              Artur Alvim");
		System.out.println("Bresser-Mooca                     Corinthians-Itaquera");
	}

	//Estações da Linha 4
	public void mapLine4() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                            ===> LINHA 4 <===                             ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Vila Sônia                        Oscar Freire");
		System.out.println("São Paulo-Morumbi                 Consolação-Paulista");
		System.out.println("Butantã                           Higienópolis-Mackenzie");
		System.out.println("Pinheiros                         República");
		System.out.println("Faria Lima                        Luz");
		System.out.println("Fradique Coutinho");
	}

	//Estações da Linha 5
	public void mapLine5() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                            ===> LINHA 5 <===                             ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Capão Redondo                     Brooklin");
		System.out.println("Campo Lindo                       Campo Belo");
		System.out.println("Vila das Belezas                  Eucaliptos");
		System.out.println("Giovanni Gronchi                  Moema");
		System.out.println("Santo Amaro                       AACD-Servidor");
		System.out.println("Largo Treze                       Hospital São Paulo");
		System.out.println("Adolfo Pinheiro                   Santa Cruz");
		System.out.println("Alto da Boa Vista                 Chácara Klabin");
		System.out.println("Borba Gato");		
	}

	//Menu com opçoes para ver as estações: uma Linha por vez, ver todas as Linhas, ou Voltar ao menu Principal
	public void queryLine() {
		headMapaLinhasQuery();
		System.out.print("[1]LINHA1 [2]LINHA2 [3]LINHA3 [4]LINHA4 [5]LINHA5 [6]TODAS [7]Voltar ");
		opc1 = ler.nextInt();
		if (opc1 == 1) {
			mapLine1();
			menu();
			newQuery();
		} else if (opc1 == 2) {
			mapLine2();
			menu();
			newQuery();
		} else if (opc1 == 3) {
			mapLine3();
			menu();
			newQuery();
		} else if (opc1 == 4) {
			mapLine4();
			menu();
			newQuery();
		} else if (opc1 == 5) {
			mapLine5();
			menu();
			newQuery();
		} else if (opc1 == 6) {
			mapLine1();
			mapLine2();
			mapLine3();
			mapLine4();
			mapLine5();
			menu();
			newQuery();
		} else if (opc1 == 7) {
			menu();
			newQuery();
		} else {
			System.out.println("### Opção inválida ###");
			queryLine();
		}
	}

	//Menu Principal
	public void newQuery() {		
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("[1]Nova consulta [2]Ver mapa das linhas [3]Sair ");
		opc = ler.nextInt();

		if (opc == 3) {
			headerSystem();
			footerSystem();
		} else if (opc == 2) {
			queryLine();
		} else if (opc == 1) {
			add.stationConnection(); //Ponte com a [Class AddStationConnection]
		} else {
			System.out.println("### Opção inválida ###");
			menu();
			newQuery();
		}
	}
}