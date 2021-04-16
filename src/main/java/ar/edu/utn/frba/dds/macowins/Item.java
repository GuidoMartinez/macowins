package ar.edu.utn.frba.dds.macowins;

public class Item {
  Prenda prenda;
  Integer cantidad;

  Item(Prenda prenda, int cant) {
    this.prenda = prenda;
    this.cantidad = cant;

  }

  public double totalPorPrenda() {
    return this.prenda.precio() * this.cantidad;
  }


}
