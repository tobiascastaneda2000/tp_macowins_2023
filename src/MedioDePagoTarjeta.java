public class MedioDePagoTarjeta implements MedioDePago {

  int cantidadCuotas;
  double coeficienteFijo;

  MedioDePagoTarjeta(int cantidadCuotas, double coeficienteFijo){
    this.cantidadCuotas = cantidadCuotas;
    this.coeficienteFijo = coeficienteFijo;
  }

  public double recargo(Prenda prenda) {
    return this.cantidadCuotas * this.coeficienteFijo + prenda.precio() * 0.01;
  }
}
