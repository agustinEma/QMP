import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrendaTest {

    @Test
    public void prendaConDatosIncompletos() {

        PrendaException thrown = Assertions.assertThrows(PrendaException.class, () -> {
              cargaDatoInicial(
                TipoDePrenda.PATALON,
                Categoria.CALZADO,
                Material.ALGODON,
               null,
                null);
        });

        Assertions
            .assertEquals("La prenda es invalida porque: no se cargo la prenda correctamente",
                thrown.getMessage());
    }

    @Test
    public void noEsUnaPrendaValida() {

        PrendaException thrown = Assertions.assertThrows(PrendaException.class, () -> {
            cargaDatoInicial(
                TipoDePrenda.PATALON,
                Categoria.CALZADO,
                Material.ALGODON,
                new Color(1,1,1),
                null);
        });

        Assertions
            .assertEquals("La prenda es invalida porque: el tipo de prenda no pertenese a la categoria",
                thrown.getMessage());



    }


    private Prenda cargaDatoInicial( TipoDePrenda tipoDePrenda,
                                     Categoria categoria,
                                     Material material,
                                     Color colorPrimario,
                                     Color colorSecundario){


        return new Prenda(
            tipoDePrenda,
            categoria,
            material,
            colorPrimario,
            colorSecundario);
    }

}
