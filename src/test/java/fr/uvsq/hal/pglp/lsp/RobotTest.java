package fr.uvsq.hal.pglp.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe <code>RobotTest</code> ...
 *
 * @author hal
 * @version 2022
 */
class RobotTest {
  // tag::avance[]
  @Test
  public void robotNeDoitPasProvoquerDException() {
    Robot robot = new Robot();
    Robot.faitFaireUnTrucA(robot);
  }
  // end::avance[]
}
