import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrendaTest {
    @Test
    public void crearPrenda() {
        Prenda prenda = new Prenda(TipoDePrenda.ZAPATOS,
            Material.ALGODON,
            Trama.LISA,
            new Color(2,3,4),
            null);
        Assertions.assertEquals(Categoria.CALZADO, prenda.getCategoria());
    }
}
