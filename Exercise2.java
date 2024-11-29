import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("¿Es palindromo?");
        System.out.println("");
        System.out.println("Ingresa una cadena de texto: ");
        String word = sc.nextLine();
        isPalindromo(word);

    }

    public static void isPalindromo(String word) {

        // pedir una palabra

        // validar si es palindromo
        word = word.replaceAll("[^A-Za-z0-9]+", "");
        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i); // la longitud es de 5 pero en indices va hasta4, por eso no
                                                        // encuentra nada en la posicion 5 y arroja error
        }

        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println("La cadena es un palindromo.");
        } else {
            System.out.println("La cadena no es un palindromo");
        }

        /*
         * System.out.println(word);
         * System.out.println(reverseWord);
         * System.out.println(word.length());
         */

        // si lo es, true

        // si no, false

    }
}
