package fr.uvsq.hal.pglp.isp;

/**
 * L'interface <code>Printer</code> regroupe les méthodes d'une imprimante.
 *
 * @author hal
 * @version 2022
 */
public interface Printer {
  void print();

  void scan();

  void copy();

  void fax();
}
