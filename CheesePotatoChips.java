3package main.java;

public class CheesePotatoChips extends PotataoChips{
    PotatoIngredientsFactory ingredientsFactory;
    public CheesePotatoChips(PotatoIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory=ingredientsFactory;
    }

    @Override
    void prepare() {
//        System.out.println("Preparing " + super.name);
        System.out.println(ingredientsFactory.createPotatoSlices());
        System.out.println(ingredientsFactory.createSauce());
    }
}
