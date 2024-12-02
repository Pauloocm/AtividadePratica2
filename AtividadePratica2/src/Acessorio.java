import javax.management.openmbean.InvalidOpenTypeException;
import java.util.Scanner;

public class Acessorio extends Peca implements Item{

    private Scanner Scan;

    public Acessorio(String descricao, int quantidadeEmEstoque, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeEmEstoque, estoqueMinimo, estoqueMaximo);

        this.Scan = new Scanner(System.in);
    }

    @Override
    protected void Venda() {

        System.out.print("Agora digite a quantidade que deseja comprar: ");
        int quantidadeVendida = Scan.nextInt();

        if(quantidadeVendida > quantidade){
            throw new InvalidOpenTypeException("Estoque insuficiente para esta venda");
        }

        quantidade -= quantidadeVendida;

        System.out.println("Compra de " + quantidadeVendida + " acessorios realizada com sucesso!");

        System.out.println("Compra realizada com sucesso de " + quantidadeVendida + " " + this.getDescricao());
    }
}
