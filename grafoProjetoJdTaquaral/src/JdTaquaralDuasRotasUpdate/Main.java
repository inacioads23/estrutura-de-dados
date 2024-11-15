package JdTaquaralDuasRotasUpdate;

public class Main {
    public static void main(String[] args) {
        // Criação do MenuAndOptions
        MenuAndOptions menu = new MenuAndOptions(null);

        // Criação do AddConnectionPoint
        AddConnectionPoint addConnectionPoint = new AddConnectionPoint(menu);

        // Atualiza o menu com o AddConnectionPoint
        menu.setAddConnectionPoint(addConnectionPoint);

        // Inicia o sistema
        menu.headerSystem();
        menu.menu();
        menu.newQuery(); // Método do menu interativo
    }
}

