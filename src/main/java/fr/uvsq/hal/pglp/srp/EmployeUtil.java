package fr.uvsq.hal.pglp.srp;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.ansi;

// tag::employeutil[]
/**
 * La classe <code>EmployeUtil</code> regroupe des méthoces utilitaires pour la classe {@link Employe}.
 *
 * @author hal
 * @version 2022
 */
public class EmployeUtil {
  public static String simpleAffichage(final Employe employe) {
    return employe.getNom() + ", " + employe.getAdresse();
  }

  public static Ansi affichageAmeliore(final Employe employe) {
    return ansi().eraseScreen().fg(RED).a(employe.getNom() + ", ").fg(GREEN).a(employe.getAdresse()).reset();
  }

  /**
   * Vérifie les affichages.
   *
   * @param args non utilisé
   */
  public static void main(String[] args) {
    Employe frodon = new Employe("Frodon", "La Comté");
    System.out.println(simpleAffichage(frodon));

    AnsiConsole.systemInstall();
    AnsiConsole.out().println(affichageAmeliore(frodon));
  }
}
// end::employeutil[]
