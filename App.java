
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        var sc = new Scanner(System.in);

        showMenu(sc);
        sc.close(); 

    }

    private static void showMenu(Scanner sc) {

        int option;

        do {
            System.out.println("========================");
            System.out.println(" Menu clase 5 ");
            System.out.println("---------------------------");
            System.out.println("1. Prueba de while");
            System.out.println("2. Prueba do-while");
            System.out.println("3. Prueba ciclo for");
            System.out.println("0. Salir de la app");
            System.out.print("Ingresa una opcion: ");

            option = sc.nextInt();
            sc.nextLine(); //Limpia el buffer o gasta el enter

            switch (option) {
                case 1:
                    whileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                    break;
                default:
                    System.err.println("Ingrese una opcione valida");
                    break;
            }
            if(option != 0){
                pressEnter(sc);
            }
            
        } while (option != 0);
        
    }

    private static void pressEnter(Scanner sc) {
        System.out.println("Presione ENTER para continuar. ");
        sc.nextLine();
    }

    private static void forTest() {
        for (int i = 0; i < 10; i += 3) {
            System.out.println(--i);
        }

        System.out.println("You Win!");
    }

    private static void doWhileTest() {
        var counter = 5;

        do {
            System.out.println(counter);

            //avance
            counter--;

            //La condicion se valida al final
        } while (counter > 0);

        System.out.println("Boom!");
    }

    private static void whileTest() {
        var counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }

}
