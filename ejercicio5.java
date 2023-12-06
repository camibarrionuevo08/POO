package ejercicio5;

import java.util.Scanner;

    public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre:");
        String name = scanner.nextLine();

        try {
            if (name.isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío.");
            }
            Person person = new Person(name);
            System.out.println("Hola, " + person.getName() + "!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
    

