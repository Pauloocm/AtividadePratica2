import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);

        Peca[] itens = new Peca[5];

        itens[0] = new RoupaPMG("Camisa", 10, 6, 6,
                6, 16);

        itens[1] = new RoupaPMG("Meia", 6, 6, 6,
                6, 20);

        itens[2] = new Acessorio("Cinto", 10, 8, 18);
        itens[3] = new Acessorio("Pulseira", 10, 8, 18);

        itens[4] = new RoupaTamanhoUnico("Saia de praia", 8, 5, 14);

        int escolha = 0;

        do {

            System.out.println();

            for (int i = 0; i < itens.length; i++){
                System.out.println((i + 1 ) +" - " + itens[i].getDescricao());
            }

            System.out.println("6 - Sair do sistema");

            System.out.println("Digite o que deseja comprar: ");
            escolha = Scan.nextInt();

            if (escolha >= 1 && escolha < itens.length + 1) {
                System.out.println("Você escolheu: " + itens[escolha - 1].getDescricao());

                itens[escolha - 1].Venda();

                itens[escolha - 1].ReposicaoEstoque();
            }

            if(escolha == 6){

                System.out.println();

                System.out.println("Estoque de cada item: ");

                System.out.print("Item    /    Estoque");

                System.out.println();
                System.out.println();
                for (int i = 0; i < itens.length; i++){



                    System.out.print(itens[i].getDescricao() + " - ");
                    System.out.println(itens[i].getQuantidade());
                }

                System.out.println();
                System.out.println("Encerrando sistema...");
            }


        }while (escolha != 6);

    }
}