/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cardo
 */
public class Singleton {
    private static Singleton instance = null;
    private static ArrayList<Persona> personas = new ArrayList<>();
    private Singleton() {
        // Constructor privado para evitar la creación de objetos desde fuera de la clase.
    }
    // Métodos de la clase Singleton...
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void start() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Actualizar persona");
            System.out.println("4. Eliminar persona");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarPersona(sc);
                    break;
                case 2:
                    mostrarPersonas();
                    break;
                case 3:
                    actualizarPersona(sc);
                    break;
                case 4:
                    eliminarPersona(sc);
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (opcion != 0);
    }

    public void agregarPersona(Scanner sc) {
        System.out.println("Ingrese el nombre:");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido:");
        String apellido = sc.next();
        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();

        personas.add(new Persona(nombre, apellido, edad));

        System.out.println("Persona agregada con éxito");
    }

    public void mostrarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas");
        } else {
            for (Persona p : personas) {
                System.out.println(p);
            }
        }
    }

    public void actualizarPersona(Scanner sc) {
        System.out.println("Ingrese el índice de la persona a actualizar:");
        int indice = sc.nextInt();

        if (indice < 0 || indice >= personas.size()) {
            System.out.println("Índice inválido");
        } else {
            Persona persona = personas.get(indice);

            System.out.println("Ingrese el nuevo nombre (actual: " + persona.getNombre() + "):");
            String nombre = sc.next();
            System.out.println("Ingrese el nuevo apellido (actual: " + persona.getApellido() + "):");
            String apellido = sc.next();
            System.out.println("Ingrese la nueva edad (actual: " + persona.getEdad() + "):");
            int edad = sc.nextInt();

            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setEdad(edad);

            System.out.println("Persona actualizada con éxito");
        }
    }

    public void eliminarPersona(Scanner sc) {
        System.out.println("Ingrese el índice de la persona a eliminar:");
        int indice = sc.nextInt();

        if (indice < 0 || indice >= personas.size()) {
            System.out.println("Índice inválido");
        } else {
            personas.remove(indice);
            System.out.println("Persona eliminada con éxito");
        }
    }

}
