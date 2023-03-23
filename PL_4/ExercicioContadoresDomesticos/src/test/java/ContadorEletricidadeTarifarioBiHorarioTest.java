import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorEletricidadeTarifarioBiHorarioTest {


    @DisplayName("Ensure calcularCustoConsumo is working")
    @Test
    public void ensureCalcularCustoConsumoIsWorking() {
        ContadorEletricidadeTarifarioBiHorario c1 = new ContadorEletricidadeTarifarioBiHorario(30,10, "Kazuha");
        assertEquals(4.86, c1.calcularCustoConsumo());
    }

}