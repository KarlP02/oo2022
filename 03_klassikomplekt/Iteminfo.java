public class Iteminfo {
    String itemname;
    int itemcost;
    int attackdamage;
    int abilitypower;

    public int getItemcost() {
        return itemcost;
    }

    @Override
    public String toString() {
        return "Iteminfo{" +
                "itemname='" + itemname + '\'' +
                ", itemcost=" + itemcost +
                ", attackdamage=" + attackdamage +
                ", abilitypower=" + abilitypower +
                '}';
    }

    public Iteminfo(String itemname, int itemcost, int attackdamage, int abilitypower) {
        this.itemname = itemname;
        this.itemcost = itemcost;
        this.attackdamage = attackdamage;
        this.abilitypower = abilitypower;
    }
}
