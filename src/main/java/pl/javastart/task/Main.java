package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Thing thing1 = new Thing("blue", "circle", true, 10.0);
        Thing thing2 = new Thing("orange", "circle", false, 120.0);
        System.out.println("Pierwszy przedmiot: " + thing1.color + " " + thing1.shape + " " + thing1.light + " " + thing1.price);
        System.out.println("Drugi przedmiot: " + thing2.color + " " + thing2.shape + " " + thing2.light + " " + thing2.price);

    }
}
