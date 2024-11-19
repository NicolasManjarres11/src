import java.util.Scanner;

public class Exercise1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        double num;

        do { 
            System.out.println("Conversion de temperaturas");
            System.out.println("");
            System.out.println("¿Que conversion quieres hacer?");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir del programa");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Inserte la temperatura a convertir:");
                    num = sc.nextDouble();
                    celsiusToFahrenheit(num);
                    break;
                case 2:
                    System.out.println("Inserte la temperatura a convertir:");
                    num = sc.nextDouble();
                    fahrenheitToCelsius(num);
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.err.println("Opcion invalida");
            }

        } while (option != 3);
        
    }

    private static void celsiusToFahrenheit(double celsius){

        double f = (celsius * (9/5))+32;
        System.out.printf("%.2f convertidos a Fahrenheit: %.2f%n",celsius,f);

    }

    private static void fahrenheitToCelsius(double fahrenheit){

        double c = (fahrenheit-32)/(9/5);
        System.out.printf("%.2f convertidos a Celsius: %.2f%n",fahrenheit,c);
    }

}
