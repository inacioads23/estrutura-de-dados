package metroGrafo;

import java.util.List;

class ResultPath {
    private List<Station> rota;
    private int custoTotal;

    // Construtor
    public ResultPath(List<Station> rota, int custoTotal) {
        this.rota = rota;
        this.custoTotal = custoTotal;
    }

    public List<Station> getRota() {
        return rota;
    }

    public int getCustoTotal() {
        return custoTotal;
    }
}
