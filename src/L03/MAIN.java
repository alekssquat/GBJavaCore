package L03;

import jdk.nashorn.internal.runtime.JSONListAdapter;

public class MAIN {
    public static void main(String[] args) {

        Basket <Apple> appleBasket = new Basket<>();
        for (int i = 0; i < 3; i++) {
            appleBasket.addFruit(new Apple());
        }

        Basket <Apple> appleBasket1 = new Basket<>();
        for (int i = 0; i < 3; i++) {
            appleBasket1.addFruit(new Apple());
        }

        Basket<Orange> orangeBasket=new Basket<>();
        for (int i = 0; i < 3; i++) {
            orangeBasket.addFruit(new Orange());
        }

        Basket<Orange> orangeBasket1=new Basket<>();
        for (int i = 0; i < 3; i++) {
            orangeBasket1.addFruit(new Orange());
        }


        System.out.println(appleBasket.getSizeOfBasket());
        System.out.println(appleBasket.getWeight());
        appleBasket.removeFruit(0);
        System.out.println(appleBasket.getSizeOfBasket());
        appleBasket.deleteBasket();
        System.out.println(appleBasket.getSizeOfBasket());
        System.out.println();

        System.out.println("appleBsk1 - "+appleBasket1.getWeight()+"\norangeBsk - "+orangeBasket.getWeight());
        System.out.println(appleBasket1.compare(orangeBasket));

        System.out.println("\nbsk 1 - "+orangeBasket.getWeight()+"\nbsk 2 - "+ orangeBasket1.getWeight());
        orangeBasket.dBasket(orangeBasket1);
        System.out.println(orangeBasket.getWeight());
        /*
        Box <Apple> appleBox=new Box<Apple>(new Apple(),new Apple(),new Apple());
        System.out.println(appleBox.getWeight());
        Box <Apple> appleBox1=new Box<Apple>(new Apple(),new Apple(),new Apple());
        System.out.println(appleBox1.getWeight());
        Box <Orange> orangeBox=new Box<Orange>(new Orange(),new Orange(),new Orange());
        System.out.println(orangeBox.getWeight());
        Box <Orange> orangeBox1=new Box<Orange>(new Orange(),new Orange(),new Orange());
        System.out.println(orangeBox1.getWeight());


        System.out.println(appleBox.compare(appleBox1));
        System.out.println(orangeBox.compare(orangeBox1));
        System.out.println(orangeBox.compare(appleBox));

        appleBox.doubledBox(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
         */






    }
}
