import java.util.Scanner;

public class EjercicioCalculadora{

    static int suma(int a, int b){
        return a+b;
    }

    static int resta(int a, int b){
        return a-b;
    }

    static int multiplicacion(int a, int b){
        return a*b;
    }

    static int division(int a, int b){
         return a/b;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String opcion = "";
        while(!opcion.equals("5")){
            System.out.println("\n## Calculadora ## ");
            System.out.println("1. sumar ");
            System.out.println("2. restar ");
            System.out.println("3. multiplicar ");
            System.out.println("4. dividir ");
            System.out.println("5. salir");
            System.out.println("Selecciona una opcion: ");
            opcion = sc.nextLine();

            if(opcion.equals("5")){
                System.out.println("saliendo del programa...");
                break;
            }

            if(opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4")){
                System.out.println("ingrese el primer numero: ");
                int a = sc.nextInt();
                System.out.println("ingrese el segundo numero: ");
                int b = sc.nextInt();
                sc.nextLine();//esta cosa de aqui del nextline sirve para que el int no se vuelva loco
                //que quiero decir es para que no se repita el programa cuando lo ejecutas
                switch(opcion){
                    case "1":
                        System.out.printf("resultado de la suma es: %d%n: ", suma(a,b));
                        break;
                    case "2":
                        System.out.printf("resultado de la resta es: %d%n: ", resta(a,b));
                        break;
                    case "3":
                        System.out.printf("resultado de la multiplicacion es: %d%n: ", multiplicacion(a,b));
                        break;
                    case "4":
                        if(b==0){
                            System.out.println("no se puede dividir por 0");}
                        else {   System.out.printf("resultado de la division es: %d%n: ", division(a,b));
                            break;
                        }

                }
            }else{
                System.out.println("opcion incorrecta intenta de nuevo");
                }

        }sc.close();


    }

}
