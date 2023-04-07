import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class RegistroVenta {
  List<Venta> ventas;

  void registrar(Venta venta){
    ventas.add(venta);
  }

  double mostrarGanaciasDeUnaFecha(LocalDate fecha){
    return ventas.stream().filter(venta -> venta.devolverFecha().isEqual(fecha)).mapToDouble(venta -> venta.precioTotal()).sum();
  }
  /*[Venta1, Venta2, Venta3] -> [23.4, 23.6, 21.4...]*/

}
