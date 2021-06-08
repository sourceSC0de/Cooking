package hu.SourceSCOde.ChefTools.KitchenWares;

import hu.SourceSCOde.ChefTools.Ingredients.Ingredient;

public class Knife extends KitchenWare{

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

    public void process(){
        this.setStatus("In Use");
        for (Ingredient ing : cuttingBoard.getIngredients()) {
            ing.setCutted(true);
        }

    }
}
