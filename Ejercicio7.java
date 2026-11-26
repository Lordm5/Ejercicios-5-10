import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce cinco calificaciones: ");
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Calificacion " + i + ": ");
            suma += scanner.nextDouble();
        }

        double promedio = suma / 5;
        System.out.println("El promedio es: " + promedio);

        if (promedio >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        scanner.close();
    }
}
