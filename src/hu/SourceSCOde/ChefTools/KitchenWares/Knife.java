package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;
import hu.SourceSCOde.ChefTools.Ingredients.Onion;

import java.util.Locale;

public class Knife extends KitchenWare{

    /**
     * Kést nem használunk vágódeszka nélkül.
     */

    private CuttingBoard cuttingBoard;

    public Knife(String status, CuttingBoard cuttingBoard) {
        super(status);
        this.cuttingBoard = cuttingBoard;
    }

    public CuttingBoard getCuttingBoard() {
        return cuttingBoard;
    }

    public void setCuttingBoard(CuttingBoard cuttingBoard) {
        this.cuttingBoard = cuttingBoard;
    }

    /**
     * A vágódeszkán található hozzávalókat összevágjuk.
     */

    public void process(){
        this.setStatus("In Use");
        for (Ingredient ing : cuttingBoard.getIngredients()) {
            ing.setCutted(true);
            System.out.println("The " + ing.getClass().getSimpleName().toLowerCase(Locale.ROOT) + " has been cut.");
            if (ing instanceof Onion) {
                System.out.println("(Damn ninjas chopping onions!)");
            }
        }

    }
}
