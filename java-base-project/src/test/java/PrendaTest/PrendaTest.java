package PrendaTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prenda.*;

import java.util.List;

public class PrendaTest {

    @Test
    public void noEsUnaPrendaValida() {
        Prenda prenda = new Prenda(
                TipoDePrenda.PATALON,
                Categoria.CALZADO,
                Material.ALGODON,
                new Color[]{Color.ROJO});

        boolean result = prenda.esValida();
       Assertions.assertFalse(result);
    }

    @Test
    public void esUnaPrendaValida() {
        Prenda prenda = new Prenda(
                TipoDePrenda.ZAPATOS,
                Categoria.CALZADO,
                Material.ALGODON,
                new Color[]{Color.ROJO});

        boolean result = prenda.esValida();
        Assertions.assertTrue(result);
    }

}
