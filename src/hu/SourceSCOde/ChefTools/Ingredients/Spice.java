package hu.SourceSCOde.ChefTools.Ingredients;

public class Spice {

    private int quantity;
    final String MEASURE;

    public Spice(int quantity, String MEASURE) {
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
}
