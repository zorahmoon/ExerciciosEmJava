import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        //lê o número que será verificado
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        //Calcula a soma dos divisores
        int somaDeDivisores = 0;
        for (int i = 1; i <= numero / 2; i++){
            if (numero % i == 0){
                somaDeDivisores += i;
            }
        }

        if (somaDeDivisores == numero){
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.err.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }
}
