package kodutöö;

public class Sedaan extends Isiklik implements Liides {
    public Sedaan(double kiirus, double vahemaa) {
        super(kiirus, vahemaa);
    }

    @Override
    public double kulunudAeg() {
        return vahemaa/kiirus;
    }
}
