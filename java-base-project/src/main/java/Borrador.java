public class Borrador {
  TipoDePrenda tipoDePrenda;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecuandario;

  public void cargarTipoPrenda(TipoDePrenda tipoDePrenda) {
    if (tipoDePrenda == null) {
      throw new PrendaException("el tipo de prenda no puede estar vacio");
    }
    this.tipoDePrenda = tipoDePrenda;
  }

  public void cargarMaterial(Material material) {
    if (material == null) {
      throw new PrendaException("el material no puede estar vacio");
    }
    this.material = material;
  }

  public void cargarTrama(Trama trama) {
    if (trama == null) {
      throw new PrendaException("la trama no puede estar vacio");
    }
    this.trama = trama;
  }

  public void cargarColorPrimario(Color colorPrimario) {
    if (colorPrimario == null) {
      throw new PrendaException("el color no puede estar vacio");
    }
    this.colorPrimario = colorPrimario;
  }

  public void cargarColorSecundario(Color colorSecundario) {
    if (colorSecundario == null) {
      throw new PrendaException("el color no puede estar vacio");
    }
    this.colorSecuandario = colorSecundario;
  }

  public Prenda crearPrenda() {
    Trama tramaDefault = this.trama == null ? Trama.LISA : this.trama;
    return  new Prenda(
        this.tipoDePrenda,
        this.material,
        tramaDefault,
        this.colorPrimario,
        this.colorSecuandario);
  }
}
