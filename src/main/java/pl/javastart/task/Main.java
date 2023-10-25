package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Thing thing1=new Thing();
        Thing thing2=new Thing();
        thing1.color="blue";
        thing1.light=true;
        thing1.price=10.00;
        thing1.shape="circle";
        thing2.color="orange";
        thing2.light=false;
        thing2.price=120.00;
        thing2.shape="circle";
        System.out.println("Pierwszy przedmiot: "+thing1.color+" "+thing1.shape+" "+thing1.light+" "+thing1.price);
        System.out.println("Drugi przedmiot: "+thing2.color+" "+thing2.shape+" "+thing2.light+" "+thing2.price);
    }
}
