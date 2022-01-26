package fr.uvsq.hal.pglp.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe <code>PrinterTest</code> ...
 *
 * @author hal
 * @version 2022
 */
class PrinterTest {
  @Test
  public void uneImprimanteNeLevePasDException() {
    Printer printer = new SimplePrinter();
    printer.scan();
  }
}
