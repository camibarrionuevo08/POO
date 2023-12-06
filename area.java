import java.util.Scanner;


    public class area {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triangulo: ");
        double a = s.nextDouble();

        System.out.println("Ingrese el segundo lado del triangulo: ");
        double b = s.nextDouble();

        double area = (b / 4) * Math.sqrt((4 * a * b) - (b * b));
        System.out.println("El area del triangulo isoseles es: " + area);

        s.close();
    }
}