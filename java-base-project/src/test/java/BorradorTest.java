import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BorradorTest {
  @Test
  public void borradorNoCargoTipoPrenda() {
    Borrador borrador = new Borrador();
    PrendaException thrown = Assertions.assertThrows(PrendaException.class, () -> {
      borrador.cargarTipoPrenda(null);
    });

    Assertions
        .assertEquals("La prenda es invalida porque: el tipo de prenda no puede estar vacio",
            thrown.getMessage());
  }

  @Test
  public void borradorNoCargoMaterial() {
    Borrador borrador = new Borrador();
    PrendaException thrown = Assertions.assertThrows(PrendaException.class, () -> {
      borrador.cargarMaterial(null);
    });

    Assertions
        .assertEquals("La prenda es invalida porque: el material no puede estar vacio",
            thrown.getMessage());
  }
  @Test
  public void borradorNoCargoTrama() {
    Borrador borrador = new Borrador();
    PrendaException thrown = Assertions.assertThrows(PrendaException.class, () -> {
      borrador.cargarTrama(null);
    });

    Assertions
        .assertEquals("La prenda es invalida porque: la trama no puede estar vacio",
            thrown.getMessage());
  }
  @Test
  public void borradorNoCargoColorPriimario() {
    Borrador borrador = new Borrador();
    PrendaException thrown = Assertions.assertThrows(PrendaException.class, () -> {
      borrador.cargarColorPrimario(null);
    });

    Assertions
        .assertEquals("La prenda es invalida porque: el color no puede estar vacio",
            thrown.getMessage());
  }
  @Test
  public void borradorNoCargoColorSecundario() {
    Borrador borrador = new Borrador();
    PrendaException thrown = Assertions.assertThrows(PrendaException.class, () -> {
      borrador.cargarColorSecundario(null);
    });

    Assertions
        .assertEquals("La prenda es invalida porque: el color no puede estar vacio",
            thrown.getMessage());
  }
}
