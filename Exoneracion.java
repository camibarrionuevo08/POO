/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exoneracion;
import java.util.Scanner;
/**
 *
 * @author cami
 */
public class Exoneracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicatio
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
    do {    
    try {    
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del visitante: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del visitante: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del visitante: ");
        String Numerocarnet = scanner.nextLine();
        
        visitante visitante1 = new visitante(nombre,edad,cedula,Numerocarnet);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el visitante");
    do {    
    try {    
        System.out.print("Ingrese el nombre del cuidador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del cuidador: "); 
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del cuidador: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del cuidador: ");
        String Numerocarnet = scanner.nextLine();
        
        Chofer cuidador1 = new Chofer(nombre,edad,cedula,Numerocarnet);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos); 
    datosCorrectos = false;
        System.out.println("se registro el cuidador");
     
    do {    
    try {    
        System.out.print("Ingrese el nombre del leon: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del leon: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el Numero registro del leon: ");
        String Numeroregistro = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del leon: ");
        String vacuna = scanner.nextLine();
        
        Leon Leon1 = new Leon(nombre,edad,Numeroregistro,vacuna);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("se registro el leon");
        
    do {    
    try {    
        System.out.print("Ingrese el nombre del pinguino: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: del pinguino");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la Numero registro: del pinguino");
        String Numeroregistro = scanner.nextLine();
       // System.out.print("Ingrese la numero de carnet: ");
        //String Numerocarnet = scanner.nextLine();
        
        Pinguino Pinguino1 = new Pinguino (nombre,edad,Numeroregistro);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos); 
    //datosCorrectos = false;
    
        System.out.println("se registro el pinguino");
    }
    
}
