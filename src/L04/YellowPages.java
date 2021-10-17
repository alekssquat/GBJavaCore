package L04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class YellowPages {
    private ArrayList<String> Name=null;
    private ArrayList<String> Number=null;

    public HashMap<String,String> getBook(ArrayList<String>accounts){

        HashMap<String,String>book=new HashMap<>();

        for (String str:accounts) {

            String[]strArr=str.split(" ",2);
            book.put(strArr[0],strArr[1]);

        }

        //for (Map.Entry<String,String> o : book.entrySet()) {System.out.print("\n"+o.getKey()+" : "+o.getValue());}



        return book;
    }

    public void getNumberByName(String name, HashMap<String,String> book ){
        for (Map.Entry<String,String> pair : book.entrySet()) {
            if (name.equals(pair.getValue())) {
                System.out.println(pair.getKey());
            }
        }
    }
}
