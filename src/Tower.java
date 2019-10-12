abstract public class Tower {
    protected int id;
    protected String Description;
    protected Double Damage;
    protected Double Health;
    protected int Cost;
    protected int UpgradeLevel;

    abstract public void Upgrade();
    abstract public void Fire();
}



