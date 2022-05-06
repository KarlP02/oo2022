package untitled.src.com.company.teineosas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoogiKastTests {

    @Test
    public void arvutaMass() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca Cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double mass = joogiKast.getMass(20);
        assertEquals(738.5, mass, 0.1);
    }

    @Test
    public void arvutaMassKuiOnRohkemKuiMahub() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca Cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double mass = joogiKast.getMass(300);
        assertEquals(738.5, mass, 0.1);
    }

    @Test
    public void arvutaHind() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca Cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(12.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        double hind = joogiKast.getHind(20);
        assertEquals(220.8, hind, 0.1);
    }

    @Test
    public void villiPudelidKasti() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca Cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(2.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        Joogivaat joogivaat = new Joogivaat(312, 36);
        int kogus = joogiKast.villiKastiPudelid(joogivaat);
        assertEquals(18, kogus, 0.1);
    }

    @Test
    public void villiPudelidKastiKuiOnTais() {
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca Cola", 0.6, 1.4);
        JoogiPudel joogiPudel = new JoogiPudel(2.0, "Klaas", 20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        Joogivaat joogivaat = new Joogivaat(312, 9999);
        int kogus = joogiKast.villiKastiPudelid(joogivaat);
        assertEquals(20, kogus, 0.1);
    }

}
