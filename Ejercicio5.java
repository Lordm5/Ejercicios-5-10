import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular su factorial: ");

        int numero = scanner.nextInt();

        long factorial = 1;

        int i = 1;

         while (i <= numero){

            factorial = factorial * i;
            i++;

        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
}
