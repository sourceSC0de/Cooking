package hu.SourceSCOde.ChefTools.Ingredients;

public class Butter extends Ingredient{



    public Butter(int quantity, String MEASURE) {
        super(quantity, MEASURE);
        this.setCuttable(false);
    }
}
