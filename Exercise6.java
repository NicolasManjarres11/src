import java.util.Scanner;

public class Exercise6 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        

        System.out.println("Conversor de unidades");

        var starProgram = true;

        do { 
        
            System.out.println("\n¿Que desea convertir?");
            System.out.println("");
            System.out.println("1. metros a kilometros");
            System.out.println("2. kilometros a metros");
            System.out.println("3. gramos a kilogramos");
            System.out.println("4. kilogramos a gramos");
            System.out.println("5. Salir del programa.");
            System.out.print("Ingresa la opción: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    metersToKilometers();
                    break;
                case 2:
                    kilometersToMeters();
                    break;
                case 3:
                    gramsToKilograms();
                    break;
                case 4:
                    kilogramsToGrams();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    starProgram = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo");
            }

        } while (starProgram);

    }

    public static void metersToKilometers(){

        System.out.print("Ingresa el valor a convertir: ");
        double num = sc.nextDouble();
        double result = num/1000;
        System.out.printf("%.1f metros equivale a %.1f kilometros.",num,result);


    }

    public static void kilometersToMeters(){

        System.out.print("Ingresa el valor a convertir: ");
        double num = sc.nextDouble();
        double result = num*1000;
        System.out.printf("%.1f kilometros equivale a %.1f metros.",num,result);
        
    }

    public static void gramsToKilograms(){

        System.out.print("Ingresa el valor a convertir: ");
        double num = sc.nextDouble();
        double result = num/1000;
        System.out.printf("%.1f gramos equivale a %.1f kilogramos.",num,result);
        
    }

    public static void kilogramsToGrams(){

        System.out.print("Ingresa el valor a convertir: ");
        double num = sc.nextDouble();
        double result = num*1000;
        System.out.printf("%.1f kilogramos equivale a %.1f gramos.",num,result);
        
    }



}
