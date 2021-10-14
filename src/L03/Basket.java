package L03;

import java.util.ArrayList;

public class Basket <T extends Fruit>{
    private ArrayList<T>bsk;

    public Basket() {
        this.bsk = new ArrayList<>();
    }

    public void addFruit(T fruit){
        bsk.add(fruit);
    }

   public Fruit getFruit(int number){
        return bsk.get(number);
   }

   public int getSizeOfBasket(){
        try {return bsk.size();}
        catch (NullPointerException e){
            System.out.println("There is no basket Neo");
            return 0;
        }
   }

   public void removeFruit(int number){
        bsk.remove(number);
   }

   public void deleteBasket(){
        bsk=null;
   }

    public float getWeight(){
        float sum=0.0f;
        for (T elementBasket: bsk) {
            sum+=elementBasket.getWeight();
        }
        return sum;
    }

    public boolean compare(Basket <?> b){
        if(this.getWeight()==b.getWeight())return true;
        else return false;
    }

    public ArrayList<T> dBasket(Basket<T>b2){
        for (int i = 0; i < b2.getSizeOfBasket(); i++) {
            this.bsk.add((T) b2.getFruit(i));
        }
        b2.deleteBasket();
        return bsk;
    }

}
