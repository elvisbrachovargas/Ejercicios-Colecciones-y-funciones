import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioFrutas {

    public static void agregarFrutas(List<String> frutas, Scanner sc){
        System.out.println("Introduce las frutas una a una. Escribe 'fin' para terminar:");
        while (true) {
            System.out.print("Ingresa una fruta: ");
            String fruta = sc.nextLine();
            if (fruta.equalsIgnoreCase("fin")) {
                break;
            }
            frutas.add(fruta);
            System.out.println("¡" + fruta + " agregada!");
        }
        System.out.println("--- Registro de frutas terminado --- \n");
    }

    public static void mostrarFrutas(List<String> frutas){
        System.out.println("--- Lista de Frutas ---");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println((i + 1) + ". " + frutas.get(i));
        }

    }

    public static void mostrarCantidad(List<String> frutas){
        System.out.println("la cantidad de frutas es "+ frutas.size());
    }

    public static void reemplazarFrutas(List<String> frutas, Scanner sc){
        System.out.println("¿que fruta deseas reemplazar?");
        String frutaVieja = sc.nextLine();

        System.out.println(("¿cual es la nueva fruta?"));
        String frutaNueva = sc.nextLine();

        int indice = frutas.indexOf(frutaVieja);

        if (indice != -1) {
            frutas.set(indice, frutaNueva);
            System.out.println("Fruta reemplazada con exito");
        }else{
            System.out.println("Fruta no encontrada");
        }
    }

    public static void eliminarFrutas(List<String> frutas, Scanner sc){
        System.out.println("que fruta deseas eliminar?");
        String eliminarFruta = sc.nextLine();

        if (frutas.contains(eliminarFruta)){
            frutas.remove(eliminarFruta);
            System.out.println("Fruta eliminada con exito");
        }else{
            System.out.println("Fruta no encontrada para eliminar");
        }
    }

    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        Scanner Escanear = new Scanner(System.in);

        agregarFrutas(frutas, Escanear);
        mostrarFrutas(frutas);
        mostrarCantidad(frutas);
        reemplazarFrutas(frutas, Escanear);
        eliminarFrutas(frutas, Escanear);

        System.out.println("\n -- lista final--");
        mostrarFrutas(frutas);

        Escanear.close();
    }
}
