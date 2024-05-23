import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
        String name= "src/data.txt";
        List<Integer> lista = new ArrayList<>(Arrays.asList(3,4,3,2,5,7,8));

        try {
            FileWriter fw = new FileWriter(name);
            PrintWriter pw = new PrintWriter(name);

        }catch (IOException e)
        {
            e.printStackTrace();
            System.out.printf("Error al ejecutar el archivo %s",name);
        }
    }
}
