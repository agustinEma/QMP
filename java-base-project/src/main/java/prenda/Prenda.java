package prenda;


public class Prenda {
TipoDePrenda tipoDePrenda;
Categoria categoria;
Material material;
Color[] colores;

public Prenda(TipoDePrenda tipoDePrenda,
              Categoria categoria,
              Material material,
              Color[] colores){

    this.tipoDePrenda = tipoDePrenda;
    this.categoria = categoria;
    this.material = material;
    this.colores = colores;
}

public boolean esValida(){
    return tipoDePrenda == TipoDePrenda.ZAPATOS
            ? categoria == Categoria.CALZADO
            : tipoDePrenda == TipoDePrenda.PATALON
            ? categoria == Categoria.PARTE_INFERIOR
            : tipoDePrenda == TipoDePrenda.CAMISA_MANGA_CORTA || tipoDePrenda == TipoDePrenda.CAMISA_MANGA_CORTA
            ? categoria == Categoria.PARTE_SUPERIOR : true;
}

}
