package SieveApp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileReaderWriter {
    public static void primeWriter(List<Integer> primeList) throws IOException{

        String fileName="Liczby Pierwsze.txt";
        FileWriter fileWriter=null;
        int wydrukowane=0;
        try {
            fileWriter = new FileWriter(fileName);
            for(int prime:primeList){
                fileWriter.write(Integer.toString(prime)+" ");
                wydrukowane++;
                if(wydrukowane==20) {
                    wydrukowane=0;
                    fileWriter.write("\r\n");
                }
            }
        }catch (IOException e){
            System.out.println("Cos nie poszlo :\\");
        }finally {
            if(fileWriter==null) System.out.println("Problem");
            else{
            fileWriter.close();
            }
        }



    }

}
