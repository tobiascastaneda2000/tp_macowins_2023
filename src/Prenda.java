public class Prenda {
  TipoPrenda tipo ;
  double precio;
  Estado estado;
  RegistroVenta registroVenta;

  Prenda(TipoPrenda tipo, int precio, Estado estado,RegistroVenta registroVenta){
    this.tipo = tipo;
    this.precio = precio;
    this.estado = estado;
    this.registroVenta = registroVenta;
  }

  TipoPrenda tipoPrenda(){
    return this.tipo;
  }

  double precio(){
    return estado.precio(this.precio);
  }



  void vender(){

  }


}

/*COMENTARIOS


Que pasa si el valorFijo es mayor a precio es estado promocion???*/
