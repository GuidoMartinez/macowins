package ar.edu.utn.frba.dds.macowins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {

  List<Item> items = new ArrayList<>();
  Date fecha;

  public void agregarItem(Item item) {
    items.add(item);
  }

  public List<Item> getItems() {
    return this.items;
  }

  Date getFecha() {
    return this.fecha;
  }



}
