package ar.edu.utn.frba.dds.macowins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVenta {
  List<Venta> totalVentas = new ArrayList<>();

  public void agregarVenta(Venta venta) {
    this.totalVentas.add(venta);
  }

  public List<Venta> totalVentasDia(Date dia) {
    return this.totalVentas.stream().filter(venta -> venta.getFecha() == dia)
        .collect(Collectors.toList());
  }
  // Req 3 //

  public double gananciasDia(Date dia) {
    return this.totalVentasDia(dia).stream().mapToDouble(Venta::costoVenta).sum();
  }
}
