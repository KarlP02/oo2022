import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Iteminfo small_sword = new Iteminfo("Small Sword",300,20,0);
        Iteminfo big_sword = new Iteminfo("Big Sword",1000,50,0);
        Iteminfo staff = new Iteminfo("Staff",1200,0,100);
        ArrayList<Iteminfo> items = new ArrayList<Iteminfo>();
        items.add(small_sword);
        items.add(big_sword);
        items.add(staff);
        Inventory inventory = new Inventory(items);

        System.out.println(inventory);
    }
}
