package hu.SourceSCOde.ChefTools.Ingredients;

public class Pepper extends Spice {
    public Pepper(int quantity, String MEASURE) {
        super(quantity, MEASURE);
        setBitter(0);
        setHot(1d);
        setSalty(0);
        setSour(0);
        setSweet(0);
    }
}
