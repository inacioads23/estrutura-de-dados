package JdTaquaralDuasRotasUpdate;

import java.util.Collections;
import java.util.List;

class ResultPath {
    private final List<Point> rota;
    private final int custoTotal;

    // Construtor
    public ResultPath(List<Point> rota, int custoTotal) {
        if (rota == null || rota.isEmpty()) {
            throw new IllegalArgumentException("A lista de rotas não pode ser nula ou vazia.");
        }
        if (custoTotal < 0) {
            throw new IllegalArgumentException("O custo total não pode ser negativo.");
        }
        this.rota = Collections.unmodifiableList(rota); // Não deixa mudar a lista
        this.custoTotal = custoTotal;
    }

    // Retorna a rota
    public List<Point> getRota() {
        return rota;
    }

    // Retorna o custo total
    public int getTotalCost() {
        return custoTotal;
    }
}

