package hu.SourceSCOde.ChefTools.Ingredients;

public class Onion extends Ingredient {
    public Onion(int quantity, String MEASURE) {
        super(quantity, MEASURE);
        setBitter(0);
        setHot(0.3);
        setSalty(0);
        setSour(0);
        setSweet(0.2);
        System.out.println("Kurvára csipi a szemem!!!!");
    }
}
