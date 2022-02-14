public class Homework1{
    public static double massarvutus(double mass){
        return mass*0.5;
    }
    public static double ruut(double kiirus){
        return kiirus*kiirus;
    }
    public static void main(String[] args){
        double arv1=Double.parseDouble(args[0]);
        double arv2=Double.parseDouble(args[1]);
        System.out.println(massarvutus(arv1)*ruut(arv2));
    }
}
