package hu.SourceSCOde.ChefTools;

import hu.SourceSCOde.ChefTools.Ingredients.*;
import hu.SourceSCOde.ChefTools.KitchenWares.*;
import hu.SourceSCOde.ChefTools.Recipes.Recipe;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Hozzávalók összeszedése.
         */

        Onion onion = new Onion(1, "pc");
        Tomato tomato = new Tomato(2, "pc");
        Paprika paprika = new Paprika(2, "pc");
        Butter butter = new Butter(25, "g");
        Salt salt = new Salt(0,"pinch");
        Pepper pepper = new Pepper(0, "pinch");
        Water water = new Water(2, "dl");

        /**
         * Eszközök előkészítése
         */

        CuttingBoard cuttingBoard = new CuttingBoard();
        Knife knife = new Knife (cuttingBoard);
        Pan pan = new Pan();
        FirePlace firePlace = new FirePlace(pan);

        Recipe recipe = new Recipe(new Ingredient[] {onion, tomato, paprika, butter, salt, pepper, water},
                new KitchenWare[] {knife, cuttingBoard, pan, firePlace}, 0.2, 0.1, "Lecsó");
        recipe.cooking();

        System.out.println("\nOur job is done here, we cooked the dinner, it's Tamás' duty to wash the dishes.");
    }
}
