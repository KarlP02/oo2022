package Salat;

import java.util.ArrayList;

public class Haldus {
    ArrayList<Toiduaine> toiduained = new ArrayList<Toiduaine>();
    Toiduaine toiduaine;

    public Haldus(Toiduaine toiduaine) {
        this.toiduaine = toiduaine;
    }

    public boolean lisaListi() {
        toiduained.add(toiduaine);
        return true;
    }

    public boolean removeListist() {
        toiduained.remove(toiduaine);
        return true;
    }

    public String otsiListist() {
        for (int i = 0; i < toiduained.size(); i++) {
            Toiduaine duplikaat = toiduained.get(i);
            if (duplikaat.nimi == toiduaine.nimi) {
                return "Rasvad: " + duplikaat.rasvap + "g Valgud: " + duplikaat.valgup + "g Süsivesikud: " + duplikaat.susivp + "g";
            }
        }
        return "Sellist toiduainet pole!";
    }

    public String otsiLististRasvaga(int minRasv, int maxRasv) {
        for (int i = 0; i < toiduained.size(); i++) {
            Toiduaine duplikaat = toiduained.get(i);
            if (duplikaat.rasvap > minRasv && duplikaat.rasvap < maxRasv) {
                return "Rasvad: " + duplikaat.rasvap + "g Valgud: " + duplikaat.valgup + "g Süsivesikud: " + duplikaat.susivp + "g";
            }
        }
        return "Sellist toiduainet pole!";
    }

}
