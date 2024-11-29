import java.util.Scanner;

public class Exercise8 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Conversor de unidades");

        var starProgram = true;

        do { 
        
            System.out.println("\n¿Que desea convertir?");
            System.out.println("");
            System.out.println("1. Area de circulo");
            System.out.println("2. Area de cuadrado");
            System.out.println("3. Area de triangulo");
            System.out.println("4. Salir del programa.");
            System.out.print("Ingresa la opción: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    circle();
                    break;
                case 2:
                    square();
                    break;
                case 3:
                    triangle();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    starProgram = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo");
            }
        
    } while(starProgram);
}

    public static void circle(){

        System.out.println("Ingresa el radio");
        double radio = sc.nextDouble();
        sc.nextLine();
        double area = 3.1416 * (Math.pow(radio, 2));
        System.out.println("El area del circulo es: "+area);

        
    }
    public static void square(){

        System.out.println("Ingresa la longitud del lado: ");
        double lenght = sc.nextInt(); 
        sc.nextLine();
        double area = Math.pow(lenght, 2);
        System.out.printf(" La longitud del cuadrado es: %.2f",area);

    }
    public static void triangle(){

        System.out.println("Ingresa la base: ");
        double base = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Ingresa la altura: ");
        double height = sc.nextInt(); 
        sc.nextLine();
        double area = (base*height)/2;
        System.out.println("El area del triangulo es: "+area);

    }


}
