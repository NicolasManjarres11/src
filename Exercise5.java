
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        System.out.println("Promedio");
        System.out.println("");
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();
        sc.nextLine();
        media(num1, num2, num3);
    }

    public static void media(int num1, int num2, int num3){

        double media = (num1+num2+num3)/3;
        System.out.println("El promedio de los 3 numeros es: "+media);

    }


}
