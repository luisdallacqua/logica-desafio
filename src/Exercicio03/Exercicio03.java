package Exercicio03;

import Exercicio01.Exercicio01;

import java.util.HashMap;

public class Exercicio03 {

    public static void main(String[] args) {

        int tamanhoDoArray = Exercicio01.aceitaApenasPositivosComoInput();
        int valorAlvo = Exercicio01.aceitaApenasPositivosComoInput();

        int[] arrayDeNumerosDoUsuario = new int[tamanhoDoArray];

        for (int i = 0; i < tamanhoDoArray; i++){
            int itemArray = Exercicio01.aceitaApenasPositivosComoInput();
            arrayDeNumerosDoUsuario[i] = itemArray;
        }

        System.out.println(quantidadeDePares(arrayDeNumerosDoUsuario, valorAlvo));
    }

    static int quantidadeDePares(int[] arr, int valorAlvo){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] - arr[j] == valorAlvo || arr[j] - arr[i] == valorAlvo) count++;
            }
        }
        return count;
    }



}
