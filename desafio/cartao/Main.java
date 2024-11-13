package desafio.cartao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: ");
        double limiteCartao = scanner.nextInt();

        Cartao cartao = new Cartao(limiteCartao);
        cartao.preencheFatura();
        cartao.printaFatura();

    }
}
