import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorVogais = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i); 

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++; 
            }
        }

        System.out.println("Número de vogais na frase: " + contadorVogais);

        scanner.close();
    }
}