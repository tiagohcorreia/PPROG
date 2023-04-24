import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpregadoTest {

    @Test
    void horasDiarias() {
        ///AAA

        //Arange
        Data d1 = new Data(2023, 1,1);
        Tempo entrada = new Tempo(8,0,0);
        Tempo saida = new Tempo(18, 0,0);
        Empregado e1 = new Empregado("Asuna", "Ei", d1, entrada, saida);

        int expected = 10;

        //Act
        int result = e1.horasDiarias();

        //Assert
        assertEquals(expected,result);

    }

}