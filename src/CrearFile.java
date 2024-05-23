import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearFile {
    public static void main(String[] args) {
        String nombreDirectorio;
        String nombreArchivo;
        String textoAEscribir;
        Scanner sc=new Scanner(System.in);
        System.out.println("Cual es el nombre del directorio a crear?");
        nombreDirectorio=sc.next();
        System.out.println("Cual es el nombre del archivo a crear?");
        nombreArchivo=sc.next();
        System.out.println("Que texto desea ingresar?");
        textoAEscribir=sc.next();
        crearFile(nombreDirectorio,nombreArchivo,textoAEscribir);

    }
    public static void crearFile(String nombreDirectorio,String nombreArchivo,String textoAEscribir){
        File directorioACrear = new File(nombreDirectorio);
        if(directorioACrear.exists()){
            System.out.println("EL directorio ya existe");
        }
        else {

            if(directorioACrear.mkdirs()){
                System.out.printf("Se a creado el directorio: %s\n", directorioACrear.getName());
            }}
        File archivo = new File(directorioACrear.getAbsolutePath()+"/"+nombreArchivo);
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
        try{
            FileWriter fileW = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fileW);
            bw.write(textoAEscribir);
            bw.close();
            System.out.println("Archivo modificado");
        }
        catch (IOException e){
            System.out.println("Error al escribir el archivo");
            e.printStackTrace();
        }
    }
}
