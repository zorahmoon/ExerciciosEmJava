import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Escolha a operação (adição(+), subtração(-), multiplicação(x), divisão(/)): ");
        String operacao = scanner.next().toLowerCase();

        int resultado;

        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;
            case "x":
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida. Por favor, escolha entre: adição, subtração, multiplicação ou divisão.");
                break;
        }

        scanner.close();
    }
}