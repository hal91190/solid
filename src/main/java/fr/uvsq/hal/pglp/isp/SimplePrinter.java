package fr.uvsq.hal.pglp.isp;

/**
 * La classe <code>SimplePrinter</code> ...
 *
 * @author hal
 * @version 2022
 */
public class SimplePrinter implements Printer {
  @Override
  public void print() {
    // print a document
  }

  @Override
  public void scan() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void copy() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void fax() {
    throw new UnsupportedOperationException();
  }
}
