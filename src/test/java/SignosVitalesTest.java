
package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import signos.SignosVitales;

public class SignosVitalesTest {

    @Test
    public void testSignosVitalesCriticos() {
        SignosVitales signos = new SignosVitales(40.5, 90, 190, 130, 89);
        assertTrue(signos.esCritico());
    }

    @Test
    public void testSignosVitalesNormales() {
        SignosVitales signos = new SignosVitales(36.5, 75, 120, 80, 98);
        assertFalse(signos.esCritico());
    }
}
