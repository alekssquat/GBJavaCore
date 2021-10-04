package L02;

public class Make2DArray {

    public static String[][] makeArray(String ValueOfCell, int NumberOfCells) {
        String[][]myArray=new String[NumberOfCells][NumberOfCells];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j]=ValueOfCell;
            }
        }
        //myArray[0][1]="E";
        //myArray[2][2]="E";
        return myArray;
    }

}
