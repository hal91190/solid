package fr.uvsq.hal.pglp.dip;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * La classe <code>UneClasseMetier</code> une classe métier.
 *
 * @author hal
 * @version 2022
 */
public class UneClasseMetier {
  static final Logger LOGGER = LogManager.getLogger();

  /**
   * Une méthode métier.
   */
  public void uneMethodeMetier() {
    LOGGER.debug("Début de uneMethodeMetier");

    // Traitements métiers

    LOGGER.debug("Fin de uneMethodeMetier");
  }
}
