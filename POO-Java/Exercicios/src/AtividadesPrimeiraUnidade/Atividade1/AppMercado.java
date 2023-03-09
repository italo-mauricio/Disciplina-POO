package AtividadesPrimeiraUnidade.Atividade1;

import java.util.Scanner;

public class AppMercado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mercado mercado = new Mercado();
        Mercado.Vendas vendas = new Mercado.Vendas();
        Mercado.Produto produto = new Mercado.Produto();
;       Mercado.Item quant = new Mercado.Item(15, produto);

        System.out.println(" ========== Zeca Barrão =========== ");
        System.out.println(" =                                = ");
        System.out.println(" Digite o nome produto: ");
        produto.descricao = scan.nextLine();
        System.out.println(" Digite o valor do produto: ");
        produto.preco = scan.nextDouble();



        System.out.println("Nome do produto: " + produto.descricao);
        System.out.println("Valor do produto: " + produto.preco);
        System.out.println("Total: " + quant.total());

    }
}
