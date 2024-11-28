import java.util.Scanner;

public class Exercise2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("¿Es palindromo?");
        System.out.println("");
        System.out.println("Ingresa una palabra");
        String word = sc.nextLine();
        isPalindromo(word);


    }

    private static void isPalindromo(String word){

        String lowercase = word.toLowerCase();
        String noSigns = lowercase.replace("[!\\\"#$%&'()*+,-./:;<=>?@\\\\[\\\\]^_`{|}~]", " ");
        String noSpaces = noSigns.trim();
        String reverseString = "";

        for(int i = noSpaces.length() - 1; i >= 0;i--){

            reverseString = reverseString + noSpaces.charAt(i);
        }

        System.out.println(reverseString);


        

    }

}
