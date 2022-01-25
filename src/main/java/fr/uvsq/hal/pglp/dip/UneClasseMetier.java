package fr.uvsq.hal.pglp.dip;

import java.time.LocalDateTime;

/**
 * La classe <code>UneClasseMetier</code> ...
 *
 * @author hal
 * @version 2022
 */
public class UneClasseMetier {
  public void uneMethodeMetier() {
    System.out.println(LocalDateTime.now() + ": Début de uneMethodeMetier"); // log message

    // Traitements métiers

    System.out.println(LocalDateTime.now() + ": Fin de uneMethodeMetier"); // log message
  }
}
