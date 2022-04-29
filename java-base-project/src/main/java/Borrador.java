public class Borrador {
  TipoDePrenda tipoDePrenda;
  Categoria categoria;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecuandario;

  public Borrador(TipoDePrenda _tipoDePrenda,
                Categoria _categoria,
                Material _material,
                  Trama _trama,
                Color _colorPrimario,
                Color _colorSecundario){



    this.tipoDePrenda=_tipoDePrenda;
    this.categoria=_categoria;
    this.material=_material;
    this.trama = _trama;
    this.colorPrimario=_colorPrimario;
    this.colorSecuandario=_colorSecundario;
  }

  public void cargarTipoPrenda(TipoDePrenda tipoDePrenda)
  {
    this.tipoDePrenda = tipoDePrenda;
  }
  public void cargarCategoria(Categoria categoria)
  {
    this.categoria = categoria;
  }
  public void cargarMaterial(Material material)
  {
    this.material= material;
  }
  public void cargarTrama(Trama trama)
  {
    this.trama = trama;
  }
  public void cargarColorPrimario(Color colorPrimario)
  {
    this.colorPrimario = colorPrimario;
  }
  public void cargarColorSecundario(Color colorSecundario)
  {
    this.colorSecuandario = colorSecundario;
  }
  public Prenda crearPrenda(){
    Trama tramaDefault = this.trama == null ? Trama.LISA : this.trama;
    return  new Prenda(
        this.tipoDePrenda,
        this.categoria,
        this.material,
        tramaDefault,
        this.colorPrimario,
        this.colorSecuandario);
  }
}
