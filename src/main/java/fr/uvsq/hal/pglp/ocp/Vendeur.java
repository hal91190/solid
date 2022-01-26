package fr.uvsq.hal.pglp.ocp;

// tag::vendeur[]
/**
 * La classe <code>Vendeur</code> ...
 *
 * @author hal
 * @version 2022
 */
public class Vendeur extends Employe {
  private double commission;

  public Vendeur(String nom, String adresse, int anciennete, double commission) {
    super(nom, adresse, anciennete);
    this.commission = commission;
  }

  @Override
  public double calculSalaire() {
    return super.calculSalaire() + commission;
  }
}
// end::vendeur[]
