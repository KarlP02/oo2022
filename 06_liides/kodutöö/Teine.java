package kodutöö;

import java.util.Random;

public class Teine implements Liides {
    int intelligence;
    String[] spells = {"Magic Beam", "Meteorite", "Poison Mist", "Bleed", "Scarlet Rot"};

    Random rand = new Random();
    int damage = 0;
    int totaldamage = 0;
    int spellnumber = rand.nextInt(5);

    public Teine(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public boolean isAlive() {
        return healthPoints() == 0;
    }

    @Override
    public int damage() {
        if (spells[spellnumber].equals("Magic Beam")) {
            damage = 3;
        }
        if (spells[spellnumber].equals("Meteorite")) {
            damage = 6;
        }
        if (spells[spellnumber].equals("Poison Mist")) {
            damage = 2;
        }
        if (spells[spellnumber].equals("Bleed")) {
            damage = 8;
        }
        if (spells[spellnumber].equals("Scarlet Rot")) {
            damage = 10;
        }

        return totaldamage = damage * intelligence;
    }

    @Override
    public int healthPoints() {
        int hp = 1000 - damage();
        if (hp < 0) {
            hp = 0;
        }
        return hp;
    }

    @Override
    public int goldDropped() {
        int gold = 0;
        if (isAlive()) {
            gold = rand.nextInt(101);
        }
        return gold;
    }
}
