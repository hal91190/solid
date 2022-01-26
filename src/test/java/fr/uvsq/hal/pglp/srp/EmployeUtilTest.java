package fr.uvsq.hal.pglp.srp;

import org.fusesource.jansi.Ansi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeUtilTest {
  Employe frodon;

  @BeforeEach
  void setup() {
    frodon = new Employe("Frodon", "La Comté");
  }

  @Test
  public void affichageSimple() {
    assertEquals("Frodon, La Comté", EmployeUtil.simpleAffichage(frodon));
  }

  @Test
  public void affichageEvolue() {
    Ansi sortie = EmployeUtil.affichageAmeliore(frodon);
    assertTrue(sortie.toString().contains("Frodon") && sortie.toString().contains("La Comté"));
  }
}
