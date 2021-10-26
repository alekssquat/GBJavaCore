package L05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class AppData {
    private String[] header;
    private int[][] data;
    int numberOfWorkers=0;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;

    }

    public void addWorker(Worker worker){
       header[numberOfWorkers]= worker.getName()+";";
       data[0][numberOfWorkers]=worker.getAge();
       data[1][numberOfWorkers]=worker.getSalary();
       numberOfWorkers++;
    }

    public void showNames(){

        for (int i = 0; i < header.length; i++) {
            System.out.print(header[i]);
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[0][i]);
        }
        System.out.println();
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[1][j]);
        }
    }

    public static void  save(AppData dataFile){
        try (FileOutputStream out = new FileOutputStream("src/L05/demo.csv")) {
            for (int i = 0; i < dataFile.header.length; i++) {
               out.write(dataFile.header[i].getBytes(StandardCharsets.UTF_8));
            }
            out.write("\n".getBytes(StandardCharsets.UTF_8));
            for (int i = 0; i < dataFile.data.length-1; i++) {
                String str;
                for (int j = 0; j < dataFile.data.length; j++){
                   str=dataFile.data[i][j]+"; ";
                    out.write(str.getBytes(StandardCharsets.UTF_8));
                }
                out.write("\n".getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
