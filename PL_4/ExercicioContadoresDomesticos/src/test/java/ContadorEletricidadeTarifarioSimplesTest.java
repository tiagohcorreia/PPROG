import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorEletricidadeTarifarioSimplesTest {

    @DisplayName("Ensure calcularCustoConsumo is working")
    @Test
    void calcularCustoConsumo() {

        ContadorEletricidadeTarifarioSimples c1 = new ContadorEletricidadeTarifarioSimples(500,5.3,"Ayaka");
        assertEquals(65, c1.calcularCustoConsumo());
    }

    @DisplayName("Ensure calcularCustoConsumo2 is working")
    @Test
    void calcularCustoConsumo2() {

        ContadorEletricidadeTarifarioSimples c1 = new ContadorEletricidadeTarifarioSimples(200,7,"Jean");
        assertEquals(32, c1.calcularCustoConsumo());
    }
}