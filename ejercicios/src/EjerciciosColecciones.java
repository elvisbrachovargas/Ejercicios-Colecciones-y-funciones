import java.util.*;

public class EjerciciosColecciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //ejercicio 1
        List<String> productos = new ArrayList<>();

        System.out.print("¿Cuántos productos desea registrar?: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el producto " + (i + 1) + ": ");
            String producto = scanner.nextLine();
            productos.add(producto);
        }

        System.out.println("\nProductos registrados:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        System.out.println("Cantidad total de productos: " + productos.size());

        System.out.println("\n------------------------------------------\n");

        //ejercicio 2
        HashSet<String> usuarios = new HashSet<>();

        System.out.print("¿Cuántos usuarios desea registrar?: ");
        int cantidadUsuarios = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.print("Ingrese el nombre de usuario " + (i + 1) + ": ");
            String usuario = scanner.nextLine();

            if (!usuarios.add(usuario)) {
                System.out.println("-> Usuario repetido");
            }
        }

        System.out.println("\nUsuarios únicos registrados:");
        for (String usuario : usuarios) {
            System.out.println("- " + usuario);
        }

        System.out.println("Cantidad total de usuarios únicos: " + usuarios.size());

        System.out.println("\n------------------------------------------\n");



        //ejercicio 3
        HashMap<String, String> agenda = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("-registro de contacto-");
        for(int i = 1; i <= 5; i++){
            System.out.println("Ingrese el nombre del contacto: ");
            String nombre = (sc.nextLine());
            System.out.println("ingrese el numero del contacto: ");
            String numero = (sc.nextLine());

            agenda.put(nombre, numero);
        }

        for (String nombre: agenda.keySet()){
            System.out.println(nombre);
        }

        for(var contacto: agenda.entrySet()){
            System.out.println(contacto.getKey());
            System.out.println(contacto.getValue());
        }

        System.out.println("busca un contacto");
        String nombreBuscar = sc.nextLine();

        if(agenda.containsKey(nombreBuscar)){
            String telefonoEncontrado = agenda.get(nombreBuscar);
            System.out.println("El telefono de " + nombreBuscar + " es: " + telefonoEncontrado);
        }else System.out.println("El telefono de " + nombreBuscar + " no existe");

        sc.close();



        //ejercicio 4
        List<Double> notas = new ArrayList<>();

        notas.add(3.5);
        notas.add(5.8);
        notas.add(4.0);
        notas.add(2.1);
        notas.add(6.5);
        notas.add(3.9);
        notas.add(7.0);

        System.out.println("--- Notas Aprobadas (>= 4.0) ---");
        notas.stream()
                .filter(n -> n >= 4.0)
                .forEach(n -> System.out.printf("%.1f ", n));
        double cantidadAprobados = notas.stream()
                .filter(n -> n >= 4.0)
                .count();
        System.out.println("\n--- Resumen ---");
        System.out.println("Cantidad de alumnos aprobados: " + cantidadAprobados);
    }
}
