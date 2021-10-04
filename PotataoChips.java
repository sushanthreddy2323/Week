package main.java;

public abstract class PotataoChips {

     String name;
     Slices potatoSlices;
     Sause sause;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PotataoChips{" +
                "name='" + name + '\'' +
                ", potatoSlices=" + potatoSlices +
                ", sause=" + sause +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Slices getPotatoSlices() {
        return potatoSlices;
    }

    public void setPotatoSlices(Slices potatoSlices) {
        this.potatoSlices = potatoSlices;
    }

    public Sause getSause() {
        return sause;
    }

    public void setSause(Sause sause) {
        this.sause = sause;
    }

     abstract void prepare();

    void fry() {
        System.out.println("Fry for 10 minutes at 350");
    }

    void addSlices() {
        System.out.println("Add the spices");
    }

    void box() {
        System.out.println("Place chips in box");
    }


}
