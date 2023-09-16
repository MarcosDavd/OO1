package examen;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeCobros {
    List<PagoEscrito> cobros;

    public SistemaDeCobros() {
        cobros = new ArrayList<PagoEscrito>();
    }

    public double valorLiquido() {
        return cobros.stream().mapToDouble(cobro -> cobro.valorLiquido()).sum();
    }
}
