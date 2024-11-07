package metroGrafo;

public class Main {
	public static void main(String[] args) {
		MenuAndOptions menu = new MenuAndOptions(); //Instancia a [Class MenuAndOptions]
		menu.headerSystem(); //Chama o método para o início do Sistema
		menu.menu(); //Chama o método para o Menu Principal
		menu.newQuery(); //Chama o método para a Consulta/ Busca
	}
}

