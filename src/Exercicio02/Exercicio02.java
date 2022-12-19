package Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double dinheiroTotal = aceitaApenasDoublePositivoComoInput();

        System.out.println("NOTAS:");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 100.00, "nota");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 50.00, "nota");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 20.00, "nota");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 10.00, "nota");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 5.00, "nota");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 2.00, "nota");
        System.out.println("MOEDAS:");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 1.00, "moeda");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 0.50, "moeda");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 0.25, "moeda");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 0.10, "moeda");
        dinheiroTotal = retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 0.05, "moeda");
        retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(dinheiroTotal, 0.01, "moeda");
    }

    public static double retiradaDaQuantidadeDeUnidadeMonetariaEImpressaoNaTelaDaQuantidade(double dinheiro, double valor, String tipo){
        int quantidadeDeDinheiro = (int) (dinheiro / valor);
        dinheiro -= quantidadeDeDinheiro * valor;

        System.out.printf(Locale.US, quantidadeDeDinheiro + "        " + tipo + "(s)         " + "    de      " + "R$  %.2f", valor);
        System.out.println();
        return dinheiro;
    }

    public static double aceitaApenasDoublePositivoComoInput(){
        Scanner in = new Scanner(System.in);
        double dinheiroTotal = -1;
        while(dinheiroTotal < 0){
            try{
                in.useLocale(Locale.US);
                dinheiroTotal = in.nextDouble();
                if(dinheiroTotal < 0) throw new IllegalArgumentException("Não é possível adicionar número menor que 0");
            }catch(IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return dinheiroTotal;
    }

}
