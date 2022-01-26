package fr.uvsq.hal.pglp.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe <code>RobotStatiqueTest</code> ...
 *
 * @author hal
 * @version 2022
 */
class RobotStatiqueTest {
  @Test
  public void robotStatiqueNeDoitPasProvoquerDException() {
    RobotStatique robot = new RobotStatique();
    Robot.faitFaireUnTrucA(robot);
  }
}
