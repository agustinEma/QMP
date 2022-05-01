public class Prenda {

  TipoDePrenda tipoDePrenda;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecundario;

  public Prenda(TipoDePrenda tipoDePrenda,
                Material material,
                Trama trama,
                Color colorPrimario,
                Color colorSecundario) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Categoria getCategoria() {
    return tipoDePrenda.getCategoria();
  }

  public TipoDePrenda getTipoDePrenda() {
    return this.tipoDePrenda;
  }

  public Material getMaterial() {
    return this.material;
  }

  public Trama getTrama() {
    return this.trama;
  }

  public Color getColorPrimario() {
    return this.colorPrimario;
  }

  public Color getColorSecundario() {
    return this.colorSecundario;
  }
}
