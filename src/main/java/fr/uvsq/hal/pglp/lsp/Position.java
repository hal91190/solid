package fr.uvsq.hal.pglp.lsp;

/**
 * La classe <code>Position</code> ...
 *
 * @author hal
 * @version 2022
 */
public class Position {
  private int posX;
  private int posY;

  public Position(int x, int y) {
    this.posX = x;
    this.posY = y;
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }
}
