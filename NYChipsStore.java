package main.java;

public class NYChipsStore extends PotatoChipsStore {

    @Override
    PotataoChips createChips(String item) {
        PotataoChips chips=null;
        if (item.equals("cheese")) {

            chips = new CheesePotatoChips(new NYPotatoIngredientsFactory());
            chips.setName("Newyork style cheese potato chips");

        }

        if(item.equals("plain")){
            chips = new PlainPotatoChips(new NYPotatoIngredientsFactory());
            chips.setName("Newyork style plain potato chips");
        }
        return chips;
    }
}
