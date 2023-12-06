package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = entrada.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = entrada.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma + ".");

        entrada.close();
    }
}