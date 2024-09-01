package prograColaborativo;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Pedir información del Alumno
    System.out.println("Ingrese la información del Alumno:");
    System.out.print("Nombre del Alumno: ");
    String nombreAlumno = scanner.nextLine();
    System.out.print("Edad del Alumno: ");
    int edadAlumno = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    // Crear instancia de Alumno
    Alumnos alumno = new Alumnos(nombreAlumno, edadAlumno, "");

    // Pedir información del Profesor
    System.out.println("Ingrese la información del Profesor:");
    System.out.print("Nombre del Profesor: ");
    String nombreProfesor = scanner.nextLine();
    System.out.print("Edad del Profesor: ");
    int edadProfesor = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    // Crear instancia de Profesor
    Profesores profesor = new Profesores(nombreProfesor, edadProfesor, "");

    // Mostrar el menú al usuario
    System.out.println("\nSeleccione una opción:");
    System.out.println("1. Asignar curso al Alumno");
    System.out.println("2. Asignar curso al Profesor");
    System.out.print("Opción: ");
    int opcion = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    switch (opcion) {
        case 1:
            // Asignar curso al Alumno
            System.out.print("Ingrese el nombre del curso para el Alumno: ");
            String cursoAlumno = scanner.nextLine();
            alumno.asignarCurso(cursoAlumno);
            // Mostrar información actualizada solo del Alumno
            System.out.println("\nInformación actualizada del Alumno:");
            System.out.println(alumno);
            break;

        case 2:
            // Asignar curso al Profesor
            System.out.print("Ingrese el nombre del curso para el Profesor: ");
            String cursoProfesor = scanner.nextLine();
            profesor.asignarCurso(cursoProfesor);
            // Mostrar información actualizada solo del Profesor
            System.out.println("\nInformación actualizada del Profesor:");
            System.out.println(profesor);
            break;

        default:
            System.out.println("Opción no válida.");
            break;
    }

    scanner.close();

	}

}
