import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //lê o número inteiro do usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        //Inicializa um contador de dígitos
        int contador = 0;

        //Se o número for negativo, irá tornar positivo
        if (numero < 0){
            numero = -numero;
        }

        //Contagem de dígitos
        if (numero == 0){
            contador = 1;
        } else {
            while (numero > 0){
                numero /= 10;
                contador++;
            }

        }

        System.out.println("O número de dígitos é: "+ contador);

        scanner.close();
    }
}