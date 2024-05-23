import java.io.FileReader;
import java.io.IOException;

public class Ejercico5 {
    public static void main(String[] args) {
        String nombre = "src/data.txt";
        try{
            FileReader fr = new FileReader(nombre);
            int data = fr.read();// lee el primer caracter
            String lectura ="";
            while (data != -1){
                lectura+=(char)data;//concatena caracter a caracter
                data = fr.read();//lee el siguiente caracter
            }
            System.out.println(lectura);
            fr.close();
        }catch (IOException e){
            System.out.printf("Problema al intentar leer el archivo %s",nombre);
            e.printStackTrace();
        }
    }
}
