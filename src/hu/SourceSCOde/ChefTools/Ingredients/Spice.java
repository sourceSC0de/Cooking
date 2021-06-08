package hu.SourceSCOde.ChefTools.Ingredients;

public class Spice extends Ingredient {

    public Spice(int quantity, String MEASURE) {
        super(quantity, MEASURE);
        this.setCuttable(false);
    }

}
