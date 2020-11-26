import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComidasTest {
    @Test
    public void loboComeChanchitoYEngordaUnPoco() {
        Lobo lobo = new Lobo();
        Chanchito chanchito = new Chanchito();

        lobo.comer(chanchito);

        assertEquals(10.0, lobo.peso());
    }

    @Test
    public void loboComeCaperucitaYEngordaMucho() {
        Lobo lobo = new Lobo();
        Caperucita caperucita = new Caperucita();

        lobo.comer(caperucita);

        assertEquals(105.0, lobo.peso());
    }
}
