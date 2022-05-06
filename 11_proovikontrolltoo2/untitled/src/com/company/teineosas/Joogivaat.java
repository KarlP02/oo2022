package untitled.src.com.company.teineosas;

public class Joogivaat {
    double ruumala;
    double liitritesJooki;

    public Joogivaat(double ruumala, double liitritesJooki) {
        this.ruumala = ruumala;
        this.liitritesJooki = liitritesJooki;
    }

    public boolean taidaJoogipudel(JoogiPudel joogiPudel) {
        if (liitritesJooki >= joogiPudel.maht) {
            System.out.println("Jooki mahub!");
            return true;
        } else {
            System.out.println("Jooki ei mahu!");
            return false;
        }
    }

    public int villiPudelid(JoogiPudel joogiPudel) {
        int loendur = 0;
        while (liitritesJooki >= joogiPudel.maht) {
            liitritesJooki -= joogiPudel.maht;
            loendur++;
        }
        System.out.println("Villisid " + loendur + " jooki");
        return loendur;
    }
}
