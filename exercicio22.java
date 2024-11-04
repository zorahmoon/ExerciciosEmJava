import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        int soma = 0;

        //Percorre todos os números de 1 até n
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0 ){ //Verifica se o número é ímpar
                soma += i; //Soma o número ímpar
            }
        }

        System.err.println("A soma de todos os números ímpares de 1 a " + n + " é: " + soma);

        scanner.close();
    }
}
