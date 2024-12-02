import java.util.Scanner;

public class RoupaTamanhoUnico extends Peca implements Item {

    public RoupaTamanhoUnico(String descricao, int quantidadeEmEstoque, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeEmEstoque, estoqueMinimo, estoqueMaximo);


    }

    @Override
    protected void Venda() {
        quantidade--;

        System.out.println("Compra realizada com sucesso de uma " + this.getDescricao());
    }
}
