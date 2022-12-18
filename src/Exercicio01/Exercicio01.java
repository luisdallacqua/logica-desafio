package Exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.print("Entre com a quantidade de números inteiros maior que zero: ");
        Scanner in = new Scanner(System.in);
        int quantidadeNumeros = in.nextInt();
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        while(quantidadeNumeros > 0){
            try{
                int valor = in.nextInt();
                if(valor < 0 ) throw new IllegalArgumentException("Não é possível adicionar número abaixo de 0");

                if(valor % 2 == 0){
                    numerosPares.add(valor);
                }else{
                    numerosImpares.add(valor);
                }
                quantidadeNumeros--;
            }catch(IllegalArgumentException e){
                e.printStackTrace();
            }
        }

        Collections.sort(numerosPares);
        numerosImpares.sort(Collections.reverseOrder());

        numerosPares.forEach(System.out::println);
        numerosImpares.forEach(System.out::println);
    }

}
