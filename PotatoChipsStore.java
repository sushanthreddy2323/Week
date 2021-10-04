package main.java;

import java.util.Scanner;

public abstract class PotatoChipsStore {

     abstract PotataoChips createChips(String item);

    public PotataoChips orderChips(String type) {
        PotataoChips chips = createChips(type);
        System.out.println("--- Making a " + chips.getName() + " ---");
        chips.prepare();
        chips.fry();
        chips.addSlices();
        chips.box();
        return chips;
    }

    public static void main(String[] args) {

        placeOrder();

       }


    public static void placeOrder(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("What type of chips would you like?");
        System.out.println("1. cheese");
        System.out.println("2. plain");
        Integer choice=scanner.nextInt();
        PotatoChipsStore store1=new ChicagoChipsStore();
        PotatoChipsStore store2=new NYChipsStore();
        if(choice==1){

            store1.orderChips("cheese");

        }
        else if(choice==2){
            store2.orderChips("plain");
        }
        else {
            System.out.println("Invalid selection please Try again.");
            placeOrder();
        }
    }
}


