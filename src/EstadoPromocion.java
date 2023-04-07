public class EstadoPromocion implements Estado {
  int valorFijo;

  EstadoPromocion(int valorFijo){
    this.valorFijo = valorFijo;
  }

  /*Que pasa si el valorFijo es mayor a precio???*/

  public double precio( double unPrecio){
    return unPrecio - valorFijo;
  }

}
