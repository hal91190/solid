package fr.uvsq.hal.pglp.ocp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe <code>VendeurTest</code> ...
 *
 * @author hal
 * @version 2022
 */
class VendeurTest {
  @ParameterizedTest
  @CsvSource({
    "0,  100.0, 1600.0",
    "1,   50.0, 1570.0",
    "5,  250.0, 1850.0",
    "10,   0.0, 1700.0"
  })
  void vendeurRecoitUnSalaireDependantDeLAncienneteEtDeLaCommission(int anciennete, double commission, double salaire) {
    Vendeur vendeur = new Vendeur("Frodon", "La Comté", anciennete, commission);
    assertEquals(salaire, vendeur.calculSalaire());
  }
}
