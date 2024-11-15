package JdTaquaralDuasRotasUpdate;

import java.util.Scanner;

public class MenuAndOptions {
	private AddConnectionPoint addConnectionPoint; // Usando a dependência injetada
	private Scanner ler = new Scanner(System.in);
	private int opc;

	// Construtor para receber o objeto AddConnectionPoint
	public MenuAndOptions(AddConnectionPoint addConnectionPoint) {
		this.addConnectionPoint = addConnectionPoint;
	}

	// Método para atualizar a dependência de AddConnectionPoint após a
	// inicialização
	public void setAddConnectionPoint(AddConnectionPoint addConnectionPoint) {
		this.addConnectionPoint = addConnectionPoint;
	}

	// Title Menu
	public void menu() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                              ---> MENU <---                              ");
		System.out.println("--------------------------------------------------------------------------");
	}

	// Início do Sistema
	public void headerSystem() {
		System.out.println("==========================================================================");
		System.out.println("=                   Sistema de Rota - Jardim Taquaral                    =");
		System.out.println("=                     Disciplina: Estrutura de Dados                     =");
		System.out.println("=                        Desenvolvido por: Inácio                        =");
		System.out.println("==========================================================================");
	}

	// Fim do Sistema
	public void footerSystem() {
		System.out.println("                ---> Sistema finalizado com sucesso! <---");
		System.out.println("==========================================================================");
		System.out.println("=                Agradecemos por escolher nosso sistema!                 =");
		System.out.println("==========================================================================");
		System.exit(0); // sai do sistema
	}

	public void headMapaPointsQuery() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                       ===> MAPA DAS CONEXÕES <===                        ");
	}

	// Menu Principal
	public void newQuery() {
		MapConnection mapConn = new MapConnection();

		System.out.print("1- Nova consulta\n2- Ver mapa das conexões\n3- Sair\n--> ");
		opc = ler.nextInt();

		if (opc == 3) {
			headerSystem();
			footerSystem();
		} else if (opc == 2) {
			headMapaPointsQuery();
			mapConn.mapPoint();
			menu();
			newQuery();
		} else if (opc == 1) {
			// Agora, chama o método correto da AddConnectionPoint
			addConnectionPoint.pointConnection();
		} else {
			System.out.println("### Opção inválida ###");
			menu();
			newQuery();
		}
	}
}

