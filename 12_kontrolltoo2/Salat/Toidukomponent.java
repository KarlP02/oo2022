package Salat;

public class Toidukomponent {
    int kogus;
    Toiduaine toiduaine;

    public Toidukomponent(int kogus, Toiduaine toiduaine) {
        this.kogus = kogus;
        this.toiduaine = toiduaine;
    }

    public double getRasv() {
        return kogus * (Double.parseDouble(String.valueOf(toiduaine.rasvap)) / 100);
    }

    public double getValk() {
        return kogus * (Double.parseDouble(String.valueOf(toiduaine.valgup)) / 100);
    }

    public double getSusiv() {
        return kogus * (Double.parseDouble(String.valueOf(toiduaine.susivp)) / 100);
    }
}
