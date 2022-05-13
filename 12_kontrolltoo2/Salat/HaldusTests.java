package Salat;

import org.junit.Test;

import static org.junit.Assert.*;

public class HaldusTests {

    @Test
    public void kontrollibKasLisabListi() {
        Toiduaine kartul = new Toiduaine("kartul", 50, 30, 20);
        Haldus addhaldus = new Haldus(kartul);
        boolean onLisatud = addhaldus.lisaListi();
        assertTrue(onLisatud);
    }

    @Test
    public void kontrollibKasEemaldabListist() {
        Toiduaine kartul = new Toiduaine("kartul", 50, 30, 20);
        Haldus addhaldus = new Haldus(kartul);
        boolean onEemaldatud = addhaldus.removeListist();
        assertTrue(onEemaldatud);
    }

    @Test
    public void kontrollibKasOtsibListist() {
        Toiduaine kartul = new Toiduaine("kartul", 50, 30, 20);
        Haldus addhaldus = new Haldus(kartul);
        addhaldus.lisaListi();
        String onLeitud = addhaldus.otsiListist();
        assertEquals("Rasvad: 30g Valgud: 50g Süsivesikud: 20g", onLeitud);
    }

    @Test
    public void kontrollibKasOtsibLististRasvaga() {
        Toiduaine porgand = new Toiduaine("porgand", 20, 20, 60);
        Haldus addhaldus = new Haldus(porgand);
        addhaldus.lisaListi();
        String onLeitud = addhaldus.otsiLististRasvaga(10, 30);
        assertEquals("Rasvad: 20g Valgud: 20g Süsivesikud: 60g", onLeitud);
    }
}
