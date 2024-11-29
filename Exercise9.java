import java.util.Scanner;

public class Exercise9 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        var starProgram = true;
        
        //Interes simple: sobre el capital inicial
        // Interes compuesto: sobre el capital inicil + intereses acumulados en cada periodo

        System.out.println("Calculo de intereses");
        do{
            System.out.println("\n¿Que deseas hacer?");
            System.out.println();
            System.out.println("1. Calulcar interes simple.");
            System.out.println("2. Calcular interes compuesto.");
            System.out.println("3. Salir del programa.");
            System.out.print("Ingresa la opcion: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    simpleInterest();
                    break;
                case 2:
                    compoundInterest();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    starProgram = false;
                    break;
                default:
                System.err.println("Opcion invalida. Intentelo de nuevo.");
                    break;
            }


        }while(starProgram);


    }

    public static void simpleInterest(){
        
        System.out.println("\n Interes simple");
        System.out.println();
        System.out.print("Ingresa el monto de capital: ");
        double p = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingresa tasa de interes anual (en porcentaje): ");
        double r = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingresa el tiempo (en anios): ");
        double t = sc.nextDouble();
        sc.nextLine();

        double i = (p*(r/100)*t);

        System.out.printf("El interes simple es: %.1f",i);

    }
    public static void compoundInterest(){

        System.out.println("\n Interes compuesto");
        System.out.println();
        System.out.print("Ingresa el monto de capital: ");
        double p = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingresa tasa de interes anual (en porcentaje): ");
        double r = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingresa el tiempo (en anios): ");
        double t = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingresa el numero de veces que se aplica el interes por anio: ");
        double n = sc.nextDouble();
        sc.nextLine();

        double a = (p*(1*(Math.pow(((r/100)/n), (n*(t))))));

        System.out.printf("El interes compuesto es: %.1f",a);

    }
}
