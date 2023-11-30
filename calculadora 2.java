import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n----CALCULADORA EXPERIMENTAL ESPE----\n");

                System.out.print("Ingrese primer numero: ");
                String number1 = scanner.nextLine();

                if (number1.equalsIgnoreCase("salir")) {
                    break;
                }

                System.out.print("Ingresa el operador [+,-,*,/] : ");
                String operador = scanner.next();
                scanner.nextLine();

                System.out.print("Ingresa segundo numero: ");
                String number2 = scanner.nextLine();

                double resultado = calcular(number1, operador, number2);
                System.out.println("Resultado de la operación es: " + resultado);

            } catch (ArithmeticException exception) {
                System.out.println("Error! No se puede dividir entre cero");
            } catch (NumberFormatException exception) {
                System.out.println("Error! Ingrese un valor numérico válido");
            } catch (InputMismatchException exception) {
                System.out.println("Error! Entrada no válida");
                scanner.nextLine();
            }
        }

        System.out.println("Saliendo.....");
        scanner.close();
    }

    public static double calcular(String number1, String operador, String number2) {
        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division por cero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}


