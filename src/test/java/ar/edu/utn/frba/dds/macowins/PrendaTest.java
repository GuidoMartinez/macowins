package ar.edu.utn.frba.dds.macowins;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrendaTest {
  
  @Test
  public void elTipoDeUnaCamisaNuevaEsCAMISA() {
    assertEquals(camisaNueva(200).getTipo().toString(), "CAMISA");
  }

  @Test
  public void elTipoDeUnSacoEnLiquidacionEsSACO() {
    assertEquals(sacoEnLiquidacion(200).getTipo().toString(), "SACO");
  }

  @Test
  public void elPrecioDeUnaCamisaNuevaEsSuPrecioBase() {
    assertEquals(camisaNueva(4000).precio(), 4000, 0);
    assertEquals(camisaNueva(5000).precio(), 5000, 0);
  }

  @Test
  public void elPrecioDeUnSacoEnLiquidacionEsSuLaMitadDeSuPrecioBase() {
    assertEquals(sacoEnLiquidacion(3000).precio(), 1500, 0);
    assertEquals(sacoEnLiquidacion(8000).precio(), 4000, 0);
  }

  @Test
  public void elPrecioDeUnPantalonEnPromocionEsSuPrecioBaseMenosSuDecuento() {
    assertEquals(pantalonEnPromocion(1500, 200).precio(), 1300, 0);
    assertEquals(pantalonEnPromocion(1500, 100).precio(), 1400, 0);
  }

  private Prenda pantalonEnPromocion(double precioBase, int descuento) {

    return new Prenda(new Promocion(descuento),precioBase,TipoPrenda.PANTALON);
  }

  private Prenda camisaNueva(double precioBase) {

    return new Prenda(new Nueva(),precioBase,TipoPrenda.CAMISA);
  }

  private Prenda sacoEnLiquidacion(double precioBase) {

    return new Prenda(new Liquidacion(),precioBase,TipoPrenda.SACO);
  }
}
