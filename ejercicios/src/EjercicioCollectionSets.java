import java.util.HashSet;
import java.util.Set;

public class EjercicioCollectionSets {
    public static void main(String[] args) {

        Set<String> correos = new HashSet<>();
        //sin duplicados
        correos.add("elvisbrachovargas@gmail.com");
        correos.add("ivic.vargasbarria@gmail.com");
        correos.add("elvisbrachovargas@gmail.com");//ignorado

        System.out.println("= SET =");
        for(String c: correos){
            System.out.println(c);
        }

        //System.out.println(correos);

        System.out.println(correos.contains("elvisbrachovargas@gmail.com"));

    }
}
