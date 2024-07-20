import java.util.Scanner;

public class Main {

    public static void holaMundo(){
        System.out.println("Mira mama mi primer programa");
        System.out.println("Holissss");
        System.out.println(" ");
    }

    public static void sumar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 =  sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 =  sc.nextInt();
        int num3 = num1 + num2 ;
        System.out.println("La suma es: "+ num3);
        System.out.println(" ");
    }

    public static void numpar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para identificar si es par");
        int num =  sc.nextInt();
        if (num % 2 == 0){
            System.out.println("El numero es par");
        }else
            System.out.println("El numero es impar");
        System.out.println(" ");

    }
    public static void factorial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular el factorial");
        int num =  sc.nextInt();

        int factorial = 1;

        for (int i = 2; i <= num ; i++){
            factorial = factorial * i;
        }

        System.out.println("El factorial de: "+ num + "es: "+ factorial);
    }

    public static void multiplicacion (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero para crear la tabla");
        int num =  sc.nextInt();

        System.out.println("La tabla de multiplicar ascendente es: ");
        for (int i = 1; i <= 10 ; i++){
            System.out.println(num +" X " + i + " = " + (num * i));
        }
        System.out.println(" ");

        System.out.println("La tabla de multiplicar descendente es: ");
        for (int i = 10; i >= 1 ; i--){
            System.out.println(num +" X " + i + " = " + (num * i));
        }
        System.out.println(" ");
    }

    public static void numMayor(){
        Scanner sc = new Scanner(System.in);
        int num = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        System.out.println("INGRESE UNA SECUENCIA DE NUMEROS Y TERMINARÁ DE ALMACENAR CUANDO SE INGRESE UN NUMERO NEGATIVO");
        do {
            try {

                num = sc.nextInt();
                if (num >= 0) {
                    if (num > mayor) {
                        mayor = num;
                    }
                    if (num < menor) {
                        menor = num;
                    }
                }
            }catch (Exception e){
                System.out.println("No esta bien el dato");
                sc.next();
            }
        }while (num >=0);
        System.out.println("El numero mayor es: "+ mayor);
        System.out.println(" ");
        System.out.println("El numero menor es: "+ menor);
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcion;
        System.out.println("Menu de opciones");
        System.out.println("Que desea hacer?");
        System.out.println(" ");
        do {
            System.out.println("1. Hola mundo");

            System.out.println("2. Sumar dos numeros");

            System.out.println("3. Determinar si un numero es par o impar");

            System.out.println("4. Calcular el factorial de un numero");

            System.out.println("5. Crear una tabla de multiplicar ascendente y descendente");

            System.out.println("6. Determinar si un numero es mayor y/o menor de una secuencia");

            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumar();
                    break;
                case 3:
                    numpar();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    multiplicacion();
                    break;
                case 6:
                    numMayor();
                    break;
                case 7:
                    System.out.println("Saliendo del programa....");
                    break;

                default:
                    System.out.println("Esta opcion no existe");
                    System.out.println(" "); //salto de linea
                    break;

            }
        }while (opcion != 7);
        sc.close();
    }

}