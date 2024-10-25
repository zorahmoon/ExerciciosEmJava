public import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String stringUsuario = scanner.nextLine();

        String stringInvertida = new StringBuilder(stringUsuario).reverse().toString();

        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }
} 