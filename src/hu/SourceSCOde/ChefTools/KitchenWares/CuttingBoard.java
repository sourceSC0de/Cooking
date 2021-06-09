package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;

  /**
  * A felszeletelendő összetevők összegyűjtésére szolgál.
  */

public class CuttingBoard extends KitchenWare{
     private Ingredient[] ingredients;

    public CuttingBoard(String status, Ingredient[] ingredients) {
        super(status);
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
