import java.util.ArrayList;

public class Inventory {
    ArrayList<Iteminfo> items = new ArrayList<Iteminfo>();

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items.toString() +
                "totalcost=" + totalcost() +
                '}';
    }

    public Inventory(ArrayList<Iteminfo> items) {
        this.items = items;
    }

    public int totalcost() {
        //items[0].getItemcost();
        int tagastatav = 0;
        for (int i = 0; i < items.size(); i++) {
            tagastatav += items.get(i).getItemcost();
        }
        return tagastatav;
    }
}
