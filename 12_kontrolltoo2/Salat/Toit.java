package Salat;

import java.util.ArrayList;

public class Toit {
    String nimi;
    Toidukomponent toidukomponent1;
    Toidukomponent toidukomponent2;
    Toidukomponent toidukomponent3;
    ArrayList<Toidukomponent> toiduretsept = new ArrayList<Toidukomponent>();

    public Toit(String nimi, Toidukomponent toidukomponent1, Toidukomponent toidukomponent2, Toidukomponent toidukomponent3) {
        this.nimi = nimi;
        this.toidukomponent1 = toidukomponent1;
        this.toidukomponent2 = toidukomponent2;
        this.toidukomponent3 = toidukomponent3;
    }

    public void lisaToidukomponent() {
        toiduretsept.add(toidukomponent1);
        toiduretsept.add(toidukomponent2);
        toiduretsept.add(toidukomponent3);
    }

    public String toiduInfo() {
        int rasv = 0;
        int susiv = 0;
        int valk = 0;
        int kogus = 0;
        for (int i = 0; i < toiduretsept.size(); i++) {
            kogus += toiduretsept.get(i).kogus;
            rasv += toiduretsept.get(i).getRasv();
            susiv += toiduretsept.get(i).getSusiv();
            valk += toiduretsept.get(i).getValk();
        }
        return "Kogus: " + kogus + "g Rasv: " + rasv + "g Süsivesikud: " + susiv + "g Valgud: " + valk + "g";
    }
}
