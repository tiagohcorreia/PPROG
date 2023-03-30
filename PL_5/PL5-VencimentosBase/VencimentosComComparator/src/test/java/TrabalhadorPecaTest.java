import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorPecaTest {

    @org.junit.jupiter.api.Test
    void calcularVencimento() {

        //AAA

        //Arange
        TrabalhadorPeca instance = new TrabalhadorPeca();
        double expextedResult = 1015;
        //Act
        double result = instance.calcularVencimento();

        //Assert
        assertEquals(expextedResult, result);
    }
}