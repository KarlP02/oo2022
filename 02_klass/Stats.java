public class Stats{
    public static void main(String[] args){
        Attackdamage yone = new Attackdamage("6306");
        Attackdamage lux = new Attackdamage("5212");
        System.out.println(yone.damage());
        System.out.println(yone.crit());
        System.out.println(lux.damage());
        System.out.println(lux.crit());
    }
}
