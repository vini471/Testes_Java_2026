import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    void deveCalcularAreaCorretamente() {
        Circulo circulo = new Circulo(2);

        assertEquals(12.566, circulo.calcularArea(), 0.001);
    }

    @Test
    void deveCalcularCircunferenciaCorretamente() {
        Circulo circulo = new Circulo(2);

        assertEquals(12.566, circulo.calcularCircunferencia(), 0.001);
    }

    @Test
    void deveAceitarRaioPositivo() {
        Circulo circulo = new Circulo(5);

        assertNotNull(circulo);
    }

    @Test
    void deveRejeitarRaioZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(0);
        });
    }

    @Test
    void deveRejeitarRaioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(-2);
        });
    }
}