import java.util.Scanner;

public class exercicio18 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular a sequência de Fibonacci: ");
        int n = scanner.nextInt();
        
        System.out.println("Número de Fibonacci em " + n + " é: " + fibonacci(n));
        
        scanner.close();
    }
}