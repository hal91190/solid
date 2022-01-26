package fr.uvsq.hal.pglp.dip;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * La classe <code>UneClasseMetier</code> une classe métier.
 *
 * @author hal
 * @version 2022
 */
public class UneClasseMetier {
  static final Logger logger = LogManager.getLogger();

  /**
   * Une méthode métier.
   */
  public void uneMethodeMetier() {
    logger.debug("Début de uneMethodeMetier");

    // Traitements métiers

    logger.debug("Fin de uneMethodeMetier");
  }
}
