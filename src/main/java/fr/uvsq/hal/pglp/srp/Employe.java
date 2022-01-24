package fr.uvsq.hal.pglp.srp;

/**
 * La classe <code>Employe</code> représente un employé.
 *
 * @author hal
 * @version 2022
 */
public class Employe {
  private final String nom;

  public Employe(String nom) {
    this.nom = nom;
  }

  public String getNom() {
    return nom;
  }
}
