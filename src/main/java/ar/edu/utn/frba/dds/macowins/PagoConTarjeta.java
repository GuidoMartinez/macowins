package ar.edu.utn.frba.dds.macowins;

import java.util.List;

public class PagoConTarjeta implements MetodoPago {
  int cantidadCuotas;
  double coeficienteFijo;

  PagoConTarjeta(int cuotas, double coeficiente) {
    this.cantidadCuotas = cuotas;
    this.coeficienteFijo = coeficiente;
  }

  public double costoFinal(List<Item> items) {

    return items.stream().mapToDouble(Item::totalPorPrenda).sum()
        + this.coeficienteFijo * this.cantidadCuotas
        + items.stream().mapToDouble(item -> item.totalPorPrenda() * 0.01).sum();
  }
}
