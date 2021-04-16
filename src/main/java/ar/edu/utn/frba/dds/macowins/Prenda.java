package ar.edu.utn.frba.dds.macowins;

public class Prenda {
  Estado estado;
  Double precioBase;
  TipoPrenda tipo;

  Prenda(Estado estado, Double precio, TipoPrenda tipo) {
    this.estado = estado;
    this.precioBase = precio;
    this.tipo = tipo;
  }
  // Req 1 //

  public Double precio() {
    return estado.precioFinal(precioBase);

  }

  // Req 2 //

  public TipoPrenda getTipo() {
    return this.tipo;
  }
  void setEstado(Estado estado) {

    this.estado = estado;
  }

}
