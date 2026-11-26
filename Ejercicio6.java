import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Introduce el tercer numero: ");
        int num3 = teclado.nextInt();

        int mayor;
        if (num1 > num2) {
            if (num1 > num3) {
                mayor = num1;
            } else {
                mayor = num3;
            }
        } else {
            if (num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        teclado.close();
    }
}
