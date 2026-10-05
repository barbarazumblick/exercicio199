package exercicio199;

import java.util.Scanner;

public class Exercicio199 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contador = 0;

        while (contador < numero) {
            System.out.println(frase);
            contador++;
        }

        scanner.close();
    }

    }
    
