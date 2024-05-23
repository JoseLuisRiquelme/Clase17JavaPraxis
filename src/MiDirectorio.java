import java.io.File;
import java.util.Scanner;

public class MiDirectorio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String directorio;
        System.out.println("Ingrese el nombre del directorio a crear");
        directorio=sc.next();
        File directorioACrear = new File(directorio);
        if(directorioACrear.exists()){
            System.out.println("EL directorio ya existe");
        }
        else {

            if(directorioACrear.mkdirs()){
                System.out.printf("Se a creado el directorio: %s\n", directorioACrear.getName());
            }}
    }
}
