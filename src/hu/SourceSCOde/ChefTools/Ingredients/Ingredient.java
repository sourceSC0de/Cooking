package hu.SourceSCOde.ChefTools.Ingredients;

public class Ingredient {

    private int quantity;
    final String MEASURE;
    private boolean isCooked = false;
    private boolean isCutted = false;
    private boolean isCuttable = true;

    public Ingredient(int quantity, String MEASURE) {
        this.quantity = quantity;
        this.MEASURE = MEASURE;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMEASURE() {
        return MEASURE;
    }

    public boolean isCooked() {
        return isCooked;
    }

    public void setCooked(boolean cooked) {
        isCooked = cooked;
    }

    public boolean isCutted() {
        return isCutted;
    }

    public void setCutted(boolean cutted) {
        isCutted = cutted;
    }

    public boolean isCuttable() {
        return isCuttable;
    }

    public void setCuttable(boolean cuttable) {
        isCuttable = cuttable;
    }
}
