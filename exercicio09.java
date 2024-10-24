import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero =  scanner.nextInt();

        System.err.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.err.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
