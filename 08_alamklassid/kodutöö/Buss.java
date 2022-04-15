package kodutöö;

public class Buss extends Uhistransport implements Liides {
    public Buss(double kiirus, double vahemaa) {
        super(kiirus, vahemaa);
    }

    @Override
    public double kulunudAeg() {
        return vahemaa/kiirus;
    }
}
