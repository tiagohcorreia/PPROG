import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorGasTest {

    @DisplayName("Ensure calcularCustoConsumo is working")
    @Test
    void calcularCustoConsumo() {
        ContadorGas c1 = new ContadorGas(200,"Miku");
        assertEquals(160, c1.calcularCustoConsumo());
    }
}