package Exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Entre com a quantidade de números inteiros maior que zero que deseja ordenar.");
        System.out.print("A ordem será: os pares em ordem ascendente após os ímpares em ordem descendente: ");
        int quantidadeNumeros = aceitaApenasPositivosComoInput();

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        while(quantidadeNumeros > 0){
                int valor = aceitaApenasPositivosComoInput();
                if(valor % 2 == 0){
                    numerosPares.add(valor);
                }else{
                    numerosImpares.add(valor);
                }
                quantidadeNumeros--;
        }
        Collections.sort(numerosPares);
        numerosImpares.sort(Collections.reverseOrder());

        numerosPares.forEach(System.out::println);
        numerosImpares.forEach(System.out::println);
    }

    public static int aceitaApenasPositivosComoInput(){
        Scanner in = new Scanner(System.in);
        int valorDoInput = -1;
        while(valorDoInput < 0){
            try{
                valorDoInput = in.nextInt();
                if(valorDoInput < 0) throw new IllegalArgumentException("Não é possível adicionar número menor que 0");
            }catch(IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return valorDoInput;
    }

}
