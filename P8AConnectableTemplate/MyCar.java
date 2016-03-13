
public class MyCar extends Vehicle implements Discountable, Connectable
{
    private int cost;
    public MyCar(int num, int cost)
    {
        super(num);
        this.cost = cost;
    }

    public String toString()
    {
        return super.toString() + "Cost: " + cost;
    }

    public void applyDiscount()
    {
        cost*=0.8;
    }
    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for a MyCar");
    }
}
