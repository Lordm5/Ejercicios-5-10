import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El numero es: positivo.");
        } else if (num < 0) {
            System.out.println("El numero es: negativo.");
        } else {
            System.out.println("El numero es: cero.");
        }

        scanner.close();
    }
}
