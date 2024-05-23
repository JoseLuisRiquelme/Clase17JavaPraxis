import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio8 {
    public static void main(String[] args) {

        String name = "src/carta.md";

        String  firstNAme="JOse Luis";
        String last_Name="Riquelme";
        String email="micorre@correo.xl";
    try {
            FileWriter fw =  new FileWriter(name);
            PrintWriter pw = new PrintWriter(fw);

            pw.printf("Estimad %s %s",firstNAme,last_Name);
            pw.printf("Le escribimos para no aburrirnos");
            pw.printf("Responda al correo %s",email);
            fw.close();
            pw.close();
        }catch (IOException e){
        e.printStackTrace();
        System.out.printf("Error al leeer %s",name);
    }

    }
}
