package AtividadesPrimeiraUnidade.Atividade1;

import java.util.Date;
import java.util.Scanner;

public class AppMercado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mercado.Vendas vendas = new Mercado.Vendas();


        System.out.println(" ========== Zeca Barrão =========== ");
        System.out.println(" =                                = ");
        System.out.println(" Digite o nome produto: ");
        String nomeProduto = scan.nextLine();
        System.out.println(" Digite o valor do produto: ");
        double precoProtudo = scan.nextDouble();
        System.out.println("Digite a quantidade de produtos: ");
        double quantidadeProdutos = scan.nextDouble();
        scan.nextLine(); // consumir a quebra de linha deixada pelo nextDouble()
        System.out.println("Digite a data de vencimento: ");
        String dataVencimento = scan.nextLine();

        Mercado.Produto produto = new Mercado.Produto(precoProtudo, nomeProduto, dataVencimento);
        Mercado.Item quant = new Mercado.Item(quantidadeProdutos, produto);

        System.out.println("Descrição do produto: " + nomeProduto);
        System.out.println("Valor do produto: " + precoProtudo);
        System.out.println("Data de vencimento: " + dataVencimento);
        System.out.println("Data da compra: " + vendas.dataAtual);
        System.out.println("Total: " + " R$ " + quant.total());
    }
}
