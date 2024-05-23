import java.util.ArrayList;
import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        //String
        String letras = "a,b,c,d,e,f";
        ArrayList<String> letrasSeparadas =
                new ArrayList<String>
                        (Arrays.asList(letras.split(",")));
        System.out.println(letrasSeparadas);

        //Join
        String letrasJuntas  = String.join("->",letrasSeparadas);
        System.out.println(letrasJuntas);
    }
}
