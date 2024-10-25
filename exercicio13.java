import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        int max = n1;

        if (n2 > max){
            max = n2;
        }

        if (n3 > max) {
            max = n3;
        }

        System.out.print("O maior número digitado foi: " + max);

        scanner.close();
    }
}