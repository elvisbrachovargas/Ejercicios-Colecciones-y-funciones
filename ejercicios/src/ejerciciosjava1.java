import java.util.Scanner;

public class ejerciciosjava1 {
    public static void main(String[] args) {
  /*      Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("ingrese su año de nacimiento: ");
        int fecha = entrada.nextInt();
        int edad = 2026 - fecha;
        System.out.println("Hola " + nombre + ", tienes aproximadamente: " + edad + " años");

        entrada.close();*/


/*        Scanner conversor = new Scanner(System.in);
        System.out.println("ingrese la temperatura en Celsius para convertirla a Fahrenheit  ");
        double celsius = conversor.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf(" la temperatura de %.2f°C equivale a %.2f°F.%n", celsius, fahrenheit);*/


/*        Scanner rectangulo = new Scanner(System.in);
        System.out.println("ingrese la base");
        double base = rectangulo.nextDouble();
        System.out.println("ingrese la altura");
        double altura = rectangulo.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

       *//* System.out.println("el area es: " + area + "el perimetro es: " + perimetro);*//*
        System.out.printf("el area es: %.2f%n y el perimetro es: %.2f%n", area, perimetro);

        rectangulo.close();*/

        /*Scanner descuento = new Scanner(System.in);
        System.out.println("ingrese el precio del producto");
        double precio = descuento.nextDouble();
        System.out.println("ingrese el porcentaje de descuento del producto (Ej: 15)");
        double porcentaje = descuento.nextDouble();

        double descuentoAplicado = precio * (porcentaje/ 100);
        double preciofinal = precio - descuentoAplicado;

        System.out.printf("el precio es: %.0f%n", preciofinal);
        System.out.printf("El descuento aplicado es: %.0f%n", descuentoAplicado);

        descuento.close();*/

/*        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double numero1 = numero.nextDouble();
        if (numero1>0){
            System.out.println("El numero es positivo");
        } else if (numero1<0 ) {
            System.out.println("El numero es negativo");
        }else System.out.println("el numero es 0");

        numero.close();*/
/*
            Scanner edad = new Scanner(System.in);
        try{
            System.out.println("ingresa tu edad");
            int edad1 = edad.nextInt();
            if(edad1>=18){
            System.out.println("es mayor de edad");
            }else {
            System.out.println("es menor de edad");}
        }catch(Exception e){
            System.out.println("error ingresa solo numeros para edad");

        }   edad.close();
*/


/*        Scanner parImpar = new Scanner(System.in);
        double pares = parImpar.nextDouble();
        if(pares % 2 == 0 ){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }
        parImpar.close();*/

        Scanner comparador = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double comparador1 = comparador.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double comparador2 = comparador.nextDouble();
        if (comparador1 > comparador2) {
            System.out.printf("El primer numero %.1f es mayor a el segundo %.1f%n", comparador1, comparador2);
        }else if (comparador1 < comparador2) {
            System.out.printf("el primer numero %.1f es menor a el segundo %.1f%n", comparador1, comparador2);
        }else {
            System.out.println("ambos numeros son iguales");
        }
        comparador.close();

        Scanner calculadora = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double num1 = calculadora.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = calculadora.nextDouble();
/*        switch (){
            case 1: double resultado = num1+num2;
        }*/
    }
}


