package kodutöö;

public class Main {
    public static void main(String[] args) {
        Esimene first = new Esimene(10, 5);
        System.out.println(first.isAlive());
        System.out.println(first.damage());
        System.out.println(first.healthPoints());
        System.out.println(first.goldDropped());

        Teine second = new Teine(10);
        System.out.println(second.isAlive());
        System.out.println(second.damage());
        System.out.println(second.healthPoints());
        System.out.println(second.goldDropped());
    }
}
