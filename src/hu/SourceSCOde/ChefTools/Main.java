package hu.SourceSCOde.ChefTools;

import hu.SourceSCOde.ChefTools.Ingredients.*;
import hu.SourceSCOde.ChefTools.KitchenWares.CuttingBoard;
import hu.SourceSCOde.ChefTools.KitchenWares.FirePlace;
import hu.SourceSCOde.ChefTools.KitchenWares.Knife;
import hu.SourceSCOde.ChefTools.KitchenWares.Pan;


public class Main {
    public static void main(String[] args) {

        Onion onion = new Onion(1, "pc");
        Tomato tomato = new Tomato(2, "pc");
        Paprika paprika = new Paprika(2, "pc");
        Butter butter = new Butter(25, "g");
        Salt salt = new Salt(0,"pinch");
        Pepper pepper = new Pepper(0, "pinch");
        //TODO Fűszerek

        CuttingBoard board = new CuttingBoard("In Use", new Ingredient[]{onion, tomato, paprika});
        Knife knife = new Knife("In Use", board);
        knife.process();

        Pan pan = new Pan("In Use", new Ingredient[] {onion, butter, tomato, paprika});
        FirePlace firePlace = new FirePlace("In Use", pan);
        boolean isTasty = spicing(new Ingredient[] {onion, butter, tomato, paprika, salt, pepper},
                0.2, 0.1);
        System.out.println((firePlace.cook() ? "Dinner is ready" +
                " and it is " + (isTasty ? "delicious!" : "not so tasty.") : "No dinner today"));



    }

    public static boolean spicing(Ingredient[] ingredients, double goalSaltiness, double goalHotness) {
        double saltiness = getAverageSaltiness(ingredients);

        Salt salt = getSaltFromIngredients(ingredients);
        while (goalSaltiness - saltiness > 0.0001){
            salt.setQuantity(salt.getQuantity() + 1);
            saltiness = getAverageSaltiness(ingredients);
        }


        double hotness = getAverageHotness(ingredients);

        Pepper pepper = getPepperFromIngredients(ingredients);
        while (goalHotness - hotness > 0.0001){
            pepper.setQuantity(pepper.getQuantity() + 1);
            hotness = getAverageHotness(ingredients);
        }

        return Math.abs(goalSaltiness - saltiness) < 0.01 && Math.abs(goalHotness - hotness) < 0.01;
    }

    private static double getAverageSaltiness(Ingredient[] ingredients) {
        double average = 0.0;
        int sumQuantity = 0;

        for (Ingredient ingredient : ingredients) {
            sumQuantity += ingredient.getQuantity();
            average += ingredient.getSalty() * ingredient.getQuantity();
        }

        average = average / sumQuantity;

        return average;
    }

    private static Salt getSaltFromIngredients(Ingredient[] ingredients) {
        int indexSalt = 0;
        while (!(ingredients[indexSalt] instanceof Salt && indexSalt < ingredients.length)){
            indexSalt++;
        }
        return (Salt) ingredients[indexSalt];
    }


    private static double getAverageHotness(Ingredient[] ingredients) {
        double average = 0.0;
        int sumQuantity = 0;

        for (Ingredient ingredient : ingredients) {
            sumQuantity += ingredient.getQuantity();
            average += ingredient.getHot() * ingredient.getQuantity();
        }

        average = average / sumQuantity;

        return average;
    }

    private static Pepper getPepperFromIngredients(Ingredient[] ingredients) {
        int indexPepper = 0;
        while (!(ingredients[indexPepper] instanceof Pepper && indexPepper < ingredients.length)){
            indexPepper++;
        }
        return (Pepper) ingredients[indexPepper];
    }

}
