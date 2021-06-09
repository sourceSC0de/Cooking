package hu.SourceSCOde.ChefTools.Ingredients;

public class Spice extends Ingredient {

    public Spice(int quantity, String MEASURE) {
        super(quantity, MEASURE);
        this.setCuttable(false);
    }

    /**
     * Megnézi, hogy az egyes ízkategóriákban milyen az étel íze, szükséges esetén fűszert ad hozzá.
     * A segédfüggvények private besorolást kaptak.
     * @param ingredients : összetevők listája
     * @param goalSaltiness : mennyire legyen sós?
     * @param goalHotness :  mennyire legyen csípős?
     * @return : jól sikerült-e a fűszerezés?
     */

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
        while (indexSalt < ingredients.length && !(ingredients[indexSalt] instanceof Salt)) {
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
        while (indexPepper < ingredients.length && !(ingredients[indexPepper] instanceof Pepper)){
            indexPepper++;
        }
        return (Pepper) ingredients[indexPepper];
    }


}
