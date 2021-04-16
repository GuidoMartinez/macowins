package ar.edu.utn.frba.dds.macowins;

public class Promocion implements Estado {
  int descuentoFijo;

  Promocion(int descuento) {
    this.descuentoFijo = descuento;

  }
  public double precioFinal(double precioBase)  {
    return precioBase - this.descuentoFijo;
  }
}
