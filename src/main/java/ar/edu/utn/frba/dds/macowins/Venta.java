package ar.edu.utn.frba.dds.macowins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {

  List<Item> items = new ArrayList<>();
  Date fecha;
  MetodoPago metodo;

  Venta(Date fecha, MetodoPago metodo) {
    this.fecha = fecha;
    this.metodo = metodo;
  }

  public void agregarItem(Item item) {
    items.add(item);
  }

  public double costoVenta() {
    return this.metodo.costoFinal(this.items);
  }

  public List<Item> getItems() {
    return this.items;
  }

  Date getFecha() {
    return this.fecha;
  }



}
