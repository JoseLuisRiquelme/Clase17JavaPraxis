import java.io.File;
import java.io.IOException;

public class Clase17 {
    public static void main(String[] args) {

        //creando un directorio
        File directorio = new File("folder/folder_hijo2/folder_nieto2/folder_bisnieto2");
        if(directorio.exists()){
            System.out.println("EL directorio ya existe");
        }
        else {

        if(directorio.mkdirs()){
            System.out.printf("Se a creado el directorio: %s\n", directorio.getName());
        }}

        File archivo = new File(directorio.getAbsolutePath()+"texto2.txt");

        try {
            if(archivo.exists()){
                System.out.println("El archivo ya existe, validado con exists");
            }
            if (archivo.createNewFile()) {

                System.out.printf("Se a creado el archivo: %s\n", archivo.getName());
            }}
            catch(IOException e){
                System.out.println("Ocurrio un error");
                e.printStackTrace();
            }

    }
}