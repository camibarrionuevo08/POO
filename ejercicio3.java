package ejercicio3;
import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz:");
        int size = scanner.nextInt();
        Matriz matriz = new Matriz(size);
        try {
            matriz.llenarMatriz();
            matriz.imprimirMatriz();
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}

class Matriz {
    private int[][] matriz;

    public Matriz(int size) {
        this.matriz = new int[size][size];
    }

    public void llenarMatriz() throws Exception {
        if (matriz == null) {
            throw new Exception("La matriz no ha sido inicializada.");
        }
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100);  // Llena la matriz con números aleatorios entre 0 y 99
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


 

    