public class EjerciciosArray {
    public static void main(String[] args) {

        //int[] edades;
        //se puede inicializar el array y luego declarar
        //edades = new int[5];


        //o tambien se puede inicializar el array y a la vez declarar
        //int[] edades = new int[5];


        int[] edades = {20, 25, 30};
        /*System.out.println(edades[0]); // 20
        System.out.println(edades[1]); // 25
        System.out.println(edades[2]); // 30

        edades[1] = 26;
        System.out.println(edades[1]);*/

/*       for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }*/

/*        int i = 0;
        while (i < edades.length) {
            System.out.println(edades[i]);
            i++;
        }*/
/*
        int total = edades.length;
        System.out.println(edades.length);*/

        String[] nombres = {"Elvis", "aron", "bracho", "vargas", "CrashWhite"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        nombres [2]= "White";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        int total = nombres.length;
        System.out.println("la cantidad de elementos son:");
        System.out.println(nombres.length);
    }
}
