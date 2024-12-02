import javax.management.openmbean.InvalidOpenTypeException;
import java.util.Scanner;

public class RoupaPMG extends Peca implements Item{
    private Scanner Scan;
    private int quantidadeEmEstoqueP;
    private int quantidadeEmEstoqueM;
    private int quantidadeEmEstoqueG;

    public RoupaPMG(String descricao, int quantidadeEmEstoqueP, int quantidadeEmEstoqueM, int quantidadeEmEstoqueG, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidadeEmEstoqueP + quantidadeEmEstoqueM + quantidadeEmEstoqueG, estoqueMinimo, estoqueMaximo);

        this.quantidadeEmEstoqueP = quantidadeEmEstoqueP;
        this.quantidadeEmEstoqueM = quantidadeEmEstoqueM;
        this.quantidadeEmEstoqueG = quantidadeEmEstoqueG;

        this.Scan = new Scanner(System.in);
    }

    @Override
    protected void Venda() {
        System.out.print("Agora digite o tamanho desejado (P, M ou G) : ");
        var tamanhoEscolhido = Scan.next().toUpperCase();

        switch(tamanhoEscolhido){
            case "P" -> quantidadeEmEstoqueP--;
            case "M" -> quantidadeEmEstoqueM--;
            case "G" -> quantidadeEmEstoqueG--;
            default -> throw new InvalidOpenTypeException("o Tamanho escolhido e invalido");
        }

        System.out.println("Compra realizada com sucesso de uma " + this.getDescricao() + " tamanho " + tamanhoEscolhido);
    }

    @Override
    protected void ReposicaoEstoque(){

        if(quantidadeEmEstoqueP < this.estoqueMinimo){
            quantidadeEmEstoqueP = estoqueMaximo;
        }

        if(quantidadeEmEstoqueM < this.estoqueMinimo){
            quantidadeEmEstoqueM = estoqueMaximo;
        }

        if(quantidadeEmEstoqueG < this.estoqueMinimo){
            quantidadeEmEstoqueG = estoqueMaximo;
        }
    }
}
