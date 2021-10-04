package main.java;

public class PlainPotatoChips extends PotataoChips{


    PotatoIngredientsFactory ingredientsFactory;
    public PlainPotatoChips(PotatoIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory=ingredientsFactory;
    }

    @Override
    void prepare() {
//        System.out.println("Preparing " + super.name);
        System.out.println(ingredientsFactory.createPotatoSlices());
        System.out.println(ingredientsFactory.createSauce());
    }
}
