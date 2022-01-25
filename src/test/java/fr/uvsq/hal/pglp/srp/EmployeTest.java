package fr.uvsq.hal.pglp.srp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
  void unEmployeSansAncienneteRecoitSonSalaireDeBase() {
    assertEquals(Employe.BASE, frodon.calculSalaire());
  }
}
