public enum TipoDePrenda {

  ZAPATOS(Categoria.CALZADO),
  CAMISA_MANGA_LARGA(Categoria.PARTE_SUPERIOR),
  CAMISA_MANGA_CORTA(Categoria.PARTE_SUPERIOR),
  PATALON(Categoria.PARTE_INFERIOR),
  LENTES(Categoria.ACCESORIO);

  Categoria categoria;

  TipoDePrenda(Categoria categoria) {

    this.categoria = categoria;
  }

  public Categoria getCategoria() {

    return this.categoria;
  }

}
