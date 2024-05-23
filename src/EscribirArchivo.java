import java.io.*;

public class EscribirArchivo {
    public static void main(String[] args) {
      String nombreDirectorio = "folder";
      String nombreArchivo= "texto3.txt";
      //escribirArchivo(nombreDirectorio);
      leerArchivo(nombreDirectorio,nombreArchivo);
    }

    public static void escribirArchivo(String nombreDirectorio){
        File archivo = new File(nombreDirectorio+"/"+"texto3.txt");
        System.out.println("Archivo creado");
        try{
        FileWriter fileW = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fileW);
        bw.write("texto escrito");
        bw.close();
            System.out.println("Archivo modificado");
        }
        catch (IOException e){
            System.out.println("Error al escribir el archivo");
            e.printStackTrace();
        }

    }
    public static void leerArchivo(String nombreDirectorio,String nombreArchivo){
        try {
            FileReader fr = new FileReader(nombreDirectorio+"/"+ nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
        }
        catch (IOException e){
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }

    }
}
