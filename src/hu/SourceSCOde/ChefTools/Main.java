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
        //TODO Fűszerek

        CuttingBoard board = new CuttingBoard("In Use", new Ingredient[]{onion, tomato, paprika});
        Knife knife = new Knife("In Use", board);
        knife.process();

        Pan pan = new Pan("In Use", new Ingredient[] {onion, butter, tomato, paprika});
        FirePlace firePlace = new FirePlace("In Use", pan);
        System.out.println("Kész a lecsó? -> " + firePlace.cook());




    }

}
