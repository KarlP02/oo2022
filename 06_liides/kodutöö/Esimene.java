package kodutöö;

import java.util.Random;

public class Esimene implements Liides {
    int attack;
    int attackCount;

    Random rand = new Random();

    public Esimene(int attack, int attackCount) {
        this.attack = attack;
        this.attackCount = attackCount;
    }

    @Override
    public boolean isAlive() {
        return healthPoints() == 0;
    }

    @Override
    public int damage() {
        return attack * attackCount;
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
