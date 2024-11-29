
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Calculo de potencias");
        System.out.println();
        System.out.print("Ingresa la base: ");
        int base = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa la potencia: ");
        int exponent = sc.nextInt();
        sc.nextLine();

        powNumbers(base, exponent);

    }

    private static void powNumbers(int base, int exponent) {
        
        double pow = Math.pow(base, exponent);
        System.out.printf(" La potencia de %d elevado a la %d es: %.0f",base,exponent,pow);

    }
}
