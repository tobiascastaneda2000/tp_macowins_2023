import java.time.LocalDate;
import java.time.LocalDateTime;

public class Venta {
  Prenda prenda;
  int cantidad;
  LocalDate fecha;
  MedioDePago medioDePago;

  Venta(Prenda prenda, int cantidad, LocalDate fecha, MedioDePago medioDePago){
    this.prenda = prenda;
    this.cantidad = cantidad;
    this.fecha = fecha;
    this.medioDePago = medioDePago;
  }

  LocalDate devolverFecha(){
    return fecha;
  }

  double precioTotal(){
    /*return (prenda.precio() + medioDePago.recargo()) * this.cantidad;*/
    return (prenda.precio() + medioDePago.recargo(this.prenda)) * this.cantidad;

  }

}
