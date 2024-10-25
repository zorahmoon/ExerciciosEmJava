//Jogo de Adivinhação

import java.util.Random;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt(); 
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}