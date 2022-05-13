package Salat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToidukomponentTests {

    @Test
    public void kontrollibKasArvutabRasvaOigesti() {
        Toiduaine kartul = new Toiduaine("kartul", 50, 30, 20);
        Toidukomponent toidukomponent = new Toidukomponent(100, kartul);
        double arvutus = toidukomponent.getRasv();
        assertEquals(30.0, arvutus, 0.1);
    }

    @Test
    public void kontrollibKasArvutabValgudOigesti() {
        Toiduaine kartul = new Toiduaine("kartul", 50, 30, 20);
        Toidukomponent toidukomponent = new Toidukomponent(100, kartul);
        double arvutus = toidukomponent.getValk();
        assertEquals(50.0, arvutus, 0.1);
    }

    @Test
    public void kontrollibKasArvutabSusivOigesti() {
        Toiduaine kartul = new Toiduaine("kartul", 50, 30, 20);
        Toidukomponent toidukomponent = new Toidukomponent(100, kartul);
        double arvutus = toidukomponent.getSusiv();
        assertEquals(20.0, arvutus, 0.1);
    }

}
