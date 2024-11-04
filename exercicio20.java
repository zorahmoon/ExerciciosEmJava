import java.util.Scanner;

public class exercicio20 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String frase = entrada.replaceAll("\\s+", "").toLowerCase();

        if (ehPalindromo(frase)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean ehPalindromo(String str) {
        int inicio = 0;
        int fim = str.length() - 1;

        while (inicio < fim) {
            if (str.charAt(inicio) != str.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true; 
    }
}