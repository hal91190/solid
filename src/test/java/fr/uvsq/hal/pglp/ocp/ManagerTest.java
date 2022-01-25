package fr.uvsq.hal.pglp.ocp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe <code>ManagerTest</code> ...
 *
 * @author hal
 * @version 2022
 */
class ManagerTest {
  @Test
  void managerRecoitUnSalaireDependantDeLAncienneteEtDeSonEquipe() {
    Employe frodon = new Employe("Frodon", "La Comté");
    Employe sam = new Employe("sam", "La Comté");
    Employe pippin = new Employe("pippin", "La Comté");
    Manager manager = new Manager("Frodon", "La Comté", 0);
    manager.add(frodon);
    manager.add(sam);
    manager.add(pippin);
    assertEquals(1800.0, manager.calculSalaire());
  }
}