package L04;

import java.util.*;

public class MakeAList {
    private ArrayList<String>list=null;

    public ArrayList<String> getList(String[] args) {
        list=new ArrayList<>(Arrays.asList(args));


        int sumOfList=0;
        for (String s:list) {
            sumOfList++;
        }
        //System.out.println("sumOfList - "+sumOfList);




        return list;
    }

    public HashSet<String> getSetList(ArrayList<String>list){

        HashSet<String>setList=new HashSet<>();
        setList.addAll(list);

        int sumOfSet=0;



        for (String s:setList
        ) {
            //System.out.print(s+" , ");
            sumOfSet++;
        }

        //System.out.println("sumOfSet - "+sumOfSet);

        return setList;

    }

    public HashMap<String,Integer>getDuplicateList(ArrayList<String>list,HashSet<String>set){
        HashMap<String,Integer>DList=new HashMap<String, Integer>();
        int sumOfDuplicate=0;
        for (String str: set) {
            for (String str1: list) {
                if(str.equals(str1))sumOfDuplicate++;
            }
            DList.put(str,sumOfDuplicate);
            sumOfDuplicate=0;
        }

        for (Map.Entry<String,Integer> o : DList.entrySet()) {
            System.out.print("\n"+o.getKey()+" : "+o.getValue());
        }
        return DList;
    }


}
