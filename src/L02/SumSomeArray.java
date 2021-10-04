package L02;



public class SumSomeArray {


    public static void makeSum(String[][]myArray){

        int boundaries=4;
        int stringsOfMyArray=myArray.length;
        int columnsOfMyArray=myArray[0].length;
        int sumOfArray=0;

        try{
            if((stringsOfMyArray!=boundaries)||(columnsOfMyArray!=boundaries))throw new MyArraySizeException();

            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    try {
                        sumOfArray+=Integer.parseInt(myArray[i][j]);
                    }catch (MyArrayDataException e){
                        System.out.print("Только Числа!");
                    }catch (NumberFormatException e){
                        String s=myArray[i][j];
                        System.out.print("Ошибка!"+"\nЯчейка\t"+i+","+j+"\n");
                        break;
                    }
                }
            }
            System.out.println("Сумма всех ячеек = "+ sumOfArray+"\n");

        }catch (MyArraySizeException e){

            System.out.println("Слишком Много Ячеек");

        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class MyArraySizeException extends IndexOutOfBoundsException{}
class MyArrayDataException extends NumberFormatException{}
