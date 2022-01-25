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

  public void tourne() { /* tourne d'1/4 de tour */ }

  public void avance() { /* avance d'une case */ }
}

class Position {
  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}

enum Direction {
  NORD, EST, SUD, OUEST
}
