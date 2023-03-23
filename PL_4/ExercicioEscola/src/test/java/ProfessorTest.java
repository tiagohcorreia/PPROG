import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @DisplayName("Ensure calcularPagamento para professor assistente works")
    @Test
    public void ensureCalcularPagamentoProfessorAdjuntoWorks() {
        Professor p1 = new Professor("Zeno",123456, "Adjunto");
        assertEquals(1800,p1.calcularPagamento());
    }

    @DisplayName("Ensure calcularPagamento para professor assistente works")
    @Test
    public void ensureCalcularPagamentoProfessorAssistenteWorks() {
        Professor p1 = new Professor("Zeno",123456, "Assistente");
        assertEquals(1500,p1.calcularPagamento());
    }

    @DisplayName("Ensure calcularPagamento para professor assistente works")
    @Test
    public void ensureCalcularPagamentoProfessorCoordenadorWorks() {
        Professor p1 = new Professor("Zeno",123456, "Coordenador");
        assertEquals(2250,p1.calcularPagamento());
    }

}