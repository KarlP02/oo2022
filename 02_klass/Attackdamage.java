public class Attackdamage{
    private String numbers;
    public Attackdamage(String newNumbers){numbers=newNumbers;}
    public double damage(){
        double basedamage = Integer.parseInt(numbers.substring(0,2)) + (1.2 * (Integer.parseInt(numbers.substring(2,4))));
        return basedamage;
    }
    public double crit(){
        return (damage() * 1.75);
    }
}
