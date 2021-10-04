package main.java;

public class ChicagoChipsStore extends PotatoChipsStore{
    @Override
    PotataoChips createChips(String item) {
    PotataoChips chips=null;
        if (item.equals("cheese")) {

            chips = new CheesePotatoChips(new ChicagoPotatoIngredientsFactory());
            chips.setName("Chicago style cheese potato chips");

        }

        if(item.equals("plain")){
            chips = new PlainPotatoChips(new ChicagoPotatoIngredientsFactory());
            chips.setName("Chicago style cheese potato chips");
        }
    return chips;
    }


}
