import java.time.LocalDate;

public class Prenda {
  TipoPrenda tipo ;
  double precioPropio;
  Estado estado;

  Prenda(TipoPrenda tipo, int precio, Estado estado){
    this.tipo = tipo;
    this.precioPropio = precio;
    this.estado = estado;
  }

  TipoPrenda tipoPrenda(){
    return this.tipo;
  }

  double precio(){
    return estado.precio(this.precioPropio);
  }

  /*
  void vender(int cantidad, MedioDePago medioDePago){
    Venta unaVenta = new Venta(this, cantidad, LocalDate.now(), medioDePago);
    registroVenta.registrar( unaVenta );}
*/
/*         Venta( prenda,  cantidad ,  fecha,  medioDePAgo )       */
  }


/*COMENTARIOS

Que pasa si el valorFijo es mayor a precio es estado promocion???
Vender() estaria en prenda o en RegistroVenta??
Al momento de crear una clase Prenda se le asigno por parametro una variable registroVenta, no tiene sentido??
*/

