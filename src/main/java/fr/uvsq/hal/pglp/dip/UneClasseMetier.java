package fr.uvsq.hal.pglp.dip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * La classe <code>UneClasseMetier</code> une classe métier.
 *
 * @author hal
 * @version 2022
 */
public class UneClasseMetier {
  static final Logger logger = LoggerFactory.getLogger(UneClasseMetier.class);

  /**
   * Une méthode métier.
   */
  public void uneMethodeMetier() {
    logger.debug("Début de uneMethodeMetier");

    // Traitements métiers

    logger.debug("Fin de uneMethodeMetier");
  }
}
