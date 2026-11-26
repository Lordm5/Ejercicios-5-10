import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros de la serie de fibonacci deseas imprimir: ");

        int n= scanner.nextInt();
        
        // Validamos que el numero ingresado es positivo
        if (n <= 0){
            System.out.println("Por favor ingrese un numero mayor a 0");
        } else {
            //Variables para almacenar los dos primeros numeros
            long primero = 0;
            long segundo = 1;
            System.out.println("Los primeros " + n + " numeros de la serie de Fibonacci son: ");
            //Bucle para calcular y imprimir la serie
            for (int i = 1; i <= n; i++) {
                System.out.print(primero + " ");
                //Calcular el siguiente numero sumando los dos anteriores
                long siguiente = primero + segundo;
                //Actualizar los valores para el proximo numero
                primero = segundo;
                segundo = siguiente;
            }
            scanner.close();
        }
    }
}
