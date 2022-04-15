package kodutöö;

public class Main {
    public static void main(String[] args) {
        Buss buss = new Buss(50.0, 200.0);
        Sedaan sedaan = new Sedaan(70.0, 120.0);
        Tostuk tostuk = new Tostuk(10.0,35.0);

        System.out.println("Bussil kulub vahemaa läbimiseks " + buss.kulunudAeg() + " tundi.");
        System.out.println("Sedaanil kulub vahemaa läbimiseks " + sedaan.kulunudAeg() + " tundi.");
        System.out.println("Tõstukil kulub vahemaa läbimiseks " + tostuk.kulunudAeg() + " tundi.");
    }
}
