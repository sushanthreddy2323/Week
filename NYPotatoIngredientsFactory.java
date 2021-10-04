package main.java;

public class NYPotatoIngredientsFactory implements PotatoIngredientsFactory {

    @Override
    public Slices createPotatoSlices() {
            return new PlainSlices();
    }

    @Override
    public Sause createSauce() {
    return new MarinaraSauce();


    }
}
