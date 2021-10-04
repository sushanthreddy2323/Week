package main.java;

public class ChicagoPotatoIngredientsFactory implements PotatoIngredientsFactory {



    @Override
    public Slices createPotatoSlices() {
        return new CrincleSlices();


    }

    @Override
    public Sause createSauce() {
        return new TomatSause();

    }


}
