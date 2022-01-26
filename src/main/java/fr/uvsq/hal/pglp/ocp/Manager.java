package fr.uvsq.hal.pglp.ocp;

import java.util.ArrayList;
import java.util.List;

// tag::manager[]
/**
 * La classe <code>Manager</code> représente un manager.
 *
 * @author hal
 * @version 2022
 */
public class Manager extends Employe {
  public static double BONUS = 100.0;

  private final List<Employe> equipe;

  public Manager(String nom, String adresse, int anciennete) {
    super(nom, adresse, anciennete);
    this.equipe = new ArrayList<>();
  }

  public void add(Employe employe) {
    equipe.add(employe);
  }

  @Override
  public double calculSalaire() {
    return super.calculSalaire() + BONUS * equipe.size();
  }
}
// end::manager[]
