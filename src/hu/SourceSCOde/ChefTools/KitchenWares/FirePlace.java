package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;

public class FirePlace extends KitchenWare{

    private Pan pan;

    public FirePlace(String status, Pan pan) {
        super(status);
        this.pan = pan;
    }

    public Pan getPan() {
        return pan;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public boolean cook(){
        for (Ingredient ing : getPan().getIngredients()) {
            if (ing.isCutted() || !ing.isCuttable()) {
                ing.setCooked(true);
            } else {
                return false;
            }
        }
        return true;
    }
}
