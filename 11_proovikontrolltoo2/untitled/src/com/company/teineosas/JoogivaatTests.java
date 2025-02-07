package untitled.src.com.company.teineosas;

import org.junit.Test;

import static org.junit.Assert.*;

public class JoogivaatTests {

    @Test
    public void taidaPudelKuiSaab() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3.0);
        boolean isTaidetud = joogivaat.taidaJoogipudel(joogiPudel);
        assertTrue(isTaidetud);
    }

    @Test
    public void taidaPudelKuiEiSaa() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        boolean isTaidetud = joogivaat.taidaJoogipudel(joogiPudel);
        assertFalse(isTaidetud);
    }

    @Test
    public void villidaSaabNull() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);
        assertEquals(0, pudeliteArv);
    }

    @Test
    public void villidaSaabRohkemKuiNull() {
        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);
        assertEquals(6, pudeliteArv);
    }

}
