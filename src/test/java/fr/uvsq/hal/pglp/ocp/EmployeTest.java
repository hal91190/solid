package fr.uvsq.hal.pglp.ocp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe <code>EmployeTest</code> ...
 *
 * @author hal
 * @version 2022
 */
class EmployeTest {
  @Test
  void employeDoitAvoirUnNom() {
    Employe frodon = new Employe("Frodon", "La Comté");
    assertEquals("Frodon", frodon.getNom());
  }
}
