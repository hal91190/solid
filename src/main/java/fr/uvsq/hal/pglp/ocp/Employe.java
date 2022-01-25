package fr.uvsq.hal.pglp.ocp;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.ansi;

/**
 * La classe <code>Employe</code> représente un employé.
 *
 * @author hal
 * @version 2022
 */
public class Employe {
  private static final int BASE = 1500;
  private static final int AUGMENTATION = 20;

  private final String nom;
  private final String adresse;
  private final int anciennete;

  public Employe(String nom, String adresse, int anciennete) {
    this.nom = nom;
    this.adresse = adresse;
    this.anciennete = anciennete;
  }

  public Employe(String nom, String adresse) {
    this(nom, adresse, 0);
  }

  public String getNom() {
    return nom;
  }

  public double calculSalaire() {
    return BASE + anciennete * AUGMENTATION;
  }

  public void afficheCoordonnees() {
    AnsiConsole.systemInstall();
    AnsiConsole.out().println(ansi().eraseScreen().fg(RED).a(nom + ", ").fg(GREEN).a(adresse).reset());
  }

  public static void main(String[] args) {
    Employe frodon = new Employe("Frodon", "La Comté");
    frodon.afficheCoordonnees();
  }
}