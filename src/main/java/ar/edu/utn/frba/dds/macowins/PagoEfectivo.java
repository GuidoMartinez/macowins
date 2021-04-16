package ar.edu.utn.frba.dds.macowins;

import java.util.List;

public class PagoEfectivo implements MetodoPago {

  public double costoFinal(List<Item> items) {
    return items.stream().mapToDouble(Item::totalPorPrenda).sum();
  }
}
