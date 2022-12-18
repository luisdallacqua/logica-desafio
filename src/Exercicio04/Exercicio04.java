package Exercicio04;

import Exercicio01.Exercicio01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidade = Exercicio01.aceitaApenasPositivosComoInput();

        while(quantidade > 0){
            String frase = in.nextLine();
            StringBuilder primeiraMetadeDaString = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder segundaMetadeDaString = new StringBuilder(frase.substring(frase.length() / 2));

            System.out.println(primeiraMetadeDaString.reverse().append(segundaMetadeDaString.reverse()).toString());
            quantidade--;
        }
        in.close();
    }

}
