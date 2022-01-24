package fr.uvsq.hal.pglp.srp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeTest {
  @Test
  void employeDoitAvoirUnNom() {
    Employe frodon = new Employe("Frodon", "La Comté");
    assertEquals("Frodon", frodon.getNom());
  }
}
