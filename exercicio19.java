import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da primeira variável (a): ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor da segunda variável (b): ");
        int b = scanner.nextInt();

        System.out.println("Antes da troca: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Depois da troca: a = " + a + ", b = " + b);

        scanner.close();
    }
}