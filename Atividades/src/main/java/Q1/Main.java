package Q1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Jogo jogo1 = new Jogo("The Legende of zelda", 299.90, 10);
            Jogo jogo2 = new Jogo("GTA5", 149.90, 15);
            Jogo jogo3 = new Jogo("Minecraft", 100.00, 5);

            int opcao;
            do {
                System.out.println("============ MENU ============");
                System.out.println("1 - Exibir itens");
                System.out.println("2 - Vender");
                System.out.println("3 - Repor");
                System.out.println("0 - Sair");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    jogo1.exibirInfo();
                    System.out.println(" ");
                    jogo2.exibirInfo();
                    System.out.println(" ");
                    jogo3.exibirInfo();

                } else if (opcao == 2 || opcao == 3) {
                    System.out.println("===== Qual jogo? =====");
                    System.out.println("1 - Zelda | 2 - GTA5 | 3 - Minecraft");
                    int escolha = sc.nextInt();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    Jogo jogo = null;
                    if (escolha == 1) jogo = jogo1;
                    else if (escolha == 2) jogo = jogo2;
                    else if (escolha == 3) jogo = jogo3;

                    if (jogo == null) {
                        System.out.println("Jogo inválido");
                    } else if (opcao == 2) {
                        jogo.vender(quantidade);
                    } else {
                        jogo.repor(quantidade);
                    }
                }

            } while (opcao != 0);

            sc.close();

    }
}
