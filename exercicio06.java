import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'A'){
                contador++;
            }
        }

        System.out.println("O número de letras 'a' encontradas: " + contador);

        scanner.close();

    }
}
