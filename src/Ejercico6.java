import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercico6 {
    public static void main(String[] args) {
        String nombre = "src/data.txt";
        try{
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(nombre);
            String data;
            while ((data = br.readLine())!=null){
                System.out.println(data);
            }
            fr.close();
            br.close();
        }catch (IOException e){
            System.out.printf("Problema al intentar leer el archivo %s",nombre);
            e.printStackTrace();
        }
    }
}
