package Salat;

public class Toiduaine {
    String nimi;
    int valgup;
    int rasvap;
    int susivp;

    public Toiduaine(String nimi, int valgup, int rasvap, int susivp) {
        if (valgup + rasvap + susivp > 100) {
            System.out.println("Ei saa üle 100 protsendi olla!");
        } else {
            this.nimi = nimi;
            this.valgup = valgup;
            this.rasvap = rasvap;
            this.susivp = susivp;
        }
    }
}
