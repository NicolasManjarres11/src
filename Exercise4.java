import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("¿Es número primo?");
        System.out.println("");
        System.out.print("Ingresa un número entero positivo: ");
        int num = sc.nextInt();
        sc.nextLine();
        isPrimeNumber(num);

    }

    public static void isPrimeNumber(int num) {


        if (num < 1) {
            System.out.println("Opcion invalida. Ingresa un numero entero positivo.");
        } else {

            num--;

            // Factorial para usar teorema de Wilson (n+1)! + 1 = multiplo de n 

            int factorial = num;

            for (int i = num; i > 0; i--) {
                if (i == num) {
                    continue;
                }

                factorial *= i;
            }

            if ((factorial + 1) % (num + 1) == 0) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }

        }

    }

}
