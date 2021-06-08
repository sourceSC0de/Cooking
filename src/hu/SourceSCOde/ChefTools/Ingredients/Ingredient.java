package hu.SourceSCOde.ChefTools.Ingredients;

public class Ingredient {

    private int quantity;
    final String MEASURE;
    private boolean isCooked = false;
    private boolean isCutted = false;
    private boolean isCuttable = true;

    //0 = 0% ; 1 = 100%
    private double salty;
    private double sweet;
    private double sour;
    private double hot;
    private double bitter;

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

    public double getSalty() {
        return salty;
    }

    public void setSalty(double salty) {
        this.salty = salty;
    }

    public double getSweet() {
        return sweet;
    }

    public void setSweet(double sweet) {
        this.sweet = sweet;
    }

    public double getSour() {
        return sour;
    }

    public void setSour(double sour) {
        this.sour = sour;
    }

    public double getHot() {
        return hot;
    }

    public void setHot(double hot) {
        this.hot = hot;
    }

    public double getBitter() {
        return bitter;
    }

    public void setBitter(double bitter) {
        this.bitter = bitter;
    }
}
