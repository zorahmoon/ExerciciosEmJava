import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean isPrimo = true;

        if (numero <= 1) {
            isPrimo = false;
        } else {

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) { 
                    isPrimo = false; 
                    break; 
                }
            }
        }

        if (isPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}