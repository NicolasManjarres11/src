import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        
        //Desde n hasta 1 o 1 hasta n

        //ingresar numero 

        //multiplicar cada numero

        //imprimir

        System.out.println("Calculo de factorial");
        System.out.println("");
        System.out.println("Ingrese un numero entero positivo");
        int num = sc .nextInt();
        System.out.println("");
        factorialNum(num);

    }

    public static void factorialNum(int num){


         int factorial = num;


         if(num < 0){
            System.out.println("Número inválido. Ingrese un número entero positivo");
        } else{

             for(int i=num;i>0;i--){
                if(i == num){
                    continue;
                }

                factorial *= i; 
            } 
        } 

        System.out.println(factorial);

    }
}
