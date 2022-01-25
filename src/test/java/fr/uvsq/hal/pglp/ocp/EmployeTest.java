package fr.uvsq.hal.pglp.ocp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * La classe <code>EmployeTest</code> ...
 *
 * @author hal
 * @version 2022
 */
class EmployeTest {
  Employe frodon;

  @BeforeEach
  void setup() {
    frodon = new Employe("Frodon", "La Comté");
  }

  @Test
  void employeDoitAvoirUnNom() {
    assertEquals("Frodon", frodon.getNom());
  }

  @Test
  void employeSansAncienneteRecoitSonSalaireDeBase() {
    assertEquals(Employe.BASE, frodon.calculSalaire());
  }

  @ParameterizedTest
  @CsvSource({
    "0,  1500.0",
    "1,  1520.0",
    "5,  1600.0",
    "10, 1700.0"
  })
  void employeRecoitUnSalaireDependantDeLAnciennete(int anciennete, double salaire) {
    Employe employe = new Employe("Frodon", "La Comté", anciennete);
    assertEquals(salaire, employe.calculSalaire());
  }
}
