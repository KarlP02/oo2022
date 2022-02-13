public class Homework1{
    public static void main(String[] arg){
        int mass=Integer.parseInt(arg[0]);
        int velocity=Integer.parseInt(arg[1]);
        int square=(int)Math.pow(velocity, 2);
        System.out.println(0.5*mass*square);
    }
}
