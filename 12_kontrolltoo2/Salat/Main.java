package Salat;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Toiduaine kartul = new Toiduaine("kartul", 50, 30, 20);
        Toiduaine porgand = new Toiduaine("porgand", 20, 20, 60);
        Toiduaine kurk = new Toiduaine("kurk", 10, 10, 80);
        Toidukomponent toidukomponent1 = new Toidukomponent(100, kartul);
        Toidukomponent toidukomponent2 = new Toidukomponent(200, porgand);
        Toidukomponent toidukomponent3 = new Toidukomponent(300, kurk);
        Toit toit1 = new Toit("salat", toidukomponent1, toidukomponent2, toidukomponent3);
        Haldus addhaldus1 = new Haldus(kartul);
        Haldus addhaldus2 = new Haldus(porgand);
        Haldus addhaldus3 = new Haldus(kurk);

        System.out.println(toidukomponent1.getRasv());
        System.out.println(toidukomponent2.getSusiv());
        System.out.println(toidukomponent3.getValk());

        addhaldus1.lisaListi();
        addhaldus2.lisaListi();
        addhaldus3.lisaListi();

        System.out.println(addhaldus1.otsiListist());
        System.out.println(addhaldus2.otsiLististRasvaga(10, 30));

        toit1.lisaToidukomponent();
        System.out.println(toit1.toiduInfo());
    }
}
