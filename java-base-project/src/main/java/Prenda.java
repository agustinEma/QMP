public class Prenda {
    TipoDePrenda tipoDePrenda;
    Categoria categoria;
    Material material;
    Color colorPrimario;
    Color colorSecuandario;

public Prenda(TipoDePrenda _tipoDePrenda,
    Categoria _categoria,
    Material _material,
    Color _colorPrimario,
    Color _colorSecundario){

    if(_tipoDePrenda==null
        || _categoria==null
        || _material==null
        || _colorPrimario==null){
    throw new PrendaException("no se cargo la prenda correctamente");
    }

    if((_tipoDePrenda == TipoDePrenda.ZAPATOS
        && _categoria != Categoria.CALZADO)
    ||(_tipoDePrenda == TipoDePrenda.PATALON
        && _categoria != Categoria.PARTE_INFERIOR)
    ||(_tipoDePrenda == TipoDePrenda.CAMISA_MANGA_LARGA
        || _tipoDePrenda == TipoDePrenda.CAMISA_MANGA_CORTA
        && _categoria != Categoria.PARTE_SUPERIOR)){
        throw new PrendaException("el tipo de prenda no pertenese a la categoria");
    }


    this.tipoDePrenda=_tipoDePrenda;
    this.categoria=_categoria;
    this.material=_material;
    this.colorPrimario=_colorPrimario;
    this.colorSecuandario=_colorSecundario;
    }

    }
