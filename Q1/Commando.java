public class Commando extends Soldier{
    private double vocationAllowance;

    public Commando(String name,double baseAllowance,double vocationAllowance){
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    public double getGrossAllowance(){
        return getBaseAllowance() + vocationAllowance;
    }

    public String toString(){
        return "Commando{Soldier{name='" + getName() + "', baseAllowance=" + getBaseAllowance() + "}" + ", vocationalAllowance=" + getGrossAllowance() + "}";
    }
}