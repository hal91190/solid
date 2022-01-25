package fr.uvsq.hal.pglp.dip;

import java.time.LocalDateTime;

/**
 * La classe <code>UneClasseMetier</code> une classe métier.
 *
 * @author hal
 * @version 2022
 */
public class UneClasseMetier {
  /**
   * Une méthode métier.
   */
  public void uneMethodeMetier() {
    System.out.println(LocalDateTime.now() + ": Début de uneMethodeMetier"); // log message

    // Traitements métiers

    System.out.println(LocalDateTime.now() + ": Fin de uneMethodeMetier"); // log message
  }
}
