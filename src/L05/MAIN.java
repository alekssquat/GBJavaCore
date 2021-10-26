package L05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MAIN {
    public static void main(String[] args){

        Worker worker1=new Worker("Squid",29,300);
        Worker worker2=new Worker("Bob",24,250);
        Worker worker3=new Worker("Pat",21,25);


        AppData appData=new AppData(new String[3],new int[3][3]);
        appData.addWorker(worker1);
        appData.addWorker(worker2);
        appData.addWorker(worker3);

        //appData.showNames();

        AppData.save(appData);

         //вывод из файла
        byte[] buf = new byte[20];

        try (FileInputStream in = new FileInputStream("src/L05/demo.csv")) {
            int count;
            while ((count = in.read(buf)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
