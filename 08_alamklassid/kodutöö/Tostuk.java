package kodutöö;

public class Tostuk extends Too implements Liides {
    public Tostuk(double kiirus, double vahemaa) {
        super(kiirus, vahemaa);
    }

    @Override
    public double kulunudAeg() {
        return vahemaa/kiirus;
    }
}
