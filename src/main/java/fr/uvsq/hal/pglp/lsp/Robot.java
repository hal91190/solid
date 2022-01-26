package fr.uvsq.hal.pglp.lsp;

/**
 * La classe <code>Robot</code> ...
 *
 * @author hal
 * @version 2022
 */
public class Robot {
  private Position position;
  private Direction direction;

  public void tourne() {
    // tourne d'1/4 de tour
  }

  public void avance() {
    // avance d'une case
  }

  /**
   * Un exemple de programme qui fait faire des actions à un robot.
   *
   * @param robot le robot qui va faire les actions
   */
  public static void faitFaireUnTrucA(Robot robot) {
    robot.tourne();
    robot.tourne();
    robot.avance();
  }
}
