package fr.uvsq.hal.pglp.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UneClasseMetierTest {
  @Test
  public void verifieLeMessageDeLog() {
    UneClasseMetier classeMetier = new UneClasseMetier();
    classeMetier.uneMethodeMetier();
  }
}