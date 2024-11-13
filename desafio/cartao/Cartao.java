package desafio.cartao;

import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Cartao {
    Scanner scanner = new Scanner(System.in);

    private double limiteCartao;
    private List<Compra> compras = new ArrayList<>();

    public Cartao(double limite){
        this.limiteCartao = limite;
    }

    public void preencheFatura(){
        int resp = 1;
        do {

            System.out.println("Digite a descrição da compra:");
            String descricao = scanner.nextLine();

            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();

            if (valor > limiteCartao) {
                System.out.println("Saldo insuficiente!");
                System.out.printf("Você possui R$%.2f de limite apenas.\n", limiteCartao);
            } else {
                compras.add(new Compra(descricao, valor));
                limiteCartao -= valor;
                System.out.println("Compra realizada!");
                if (limiteCartao == 0){
                    System.out.println("Você não tem mais limite.");
                    System.out.println("Encerrando programa.\n");
                    break;
                }
                System.out.printf("Seu saldo atual é de R$%.2f\n", limiteCartao);
            }
                System.out.println("Digite 0 para sair ou 1 para continuar:");
                resp = scanner.nextInt();
                scanner.nextLine();

        }while(resp == 1);
    }

    public void printaFatura(){
        compras.sort(Comparator.comparing(Compra::getValor));
        compras.forEach(System.out::println);
    }
}
