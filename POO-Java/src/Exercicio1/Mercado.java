package src.Exercicio1;

import java.util.List;
import java.util.Scanner;

public class Mercado {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mercado mercado = new Mercado();
        Vendas vendas = new Vendas();
        Produto produto = new Produto();

        System.out.println(" ========== Zeca Barrão =========== ");
        System.out.println(" =                                = ");
        System.out.println(" Digite o nome produto: ");
        produto.descricao = scan.nextLine();
        System.out.println(" Digite o valor do produto: ");
        produto.preco = scan.nextDouble();
        System.out.println("");
    }
    public class Vendas{
        String data;
        List<Mercado.Item> itens;

        double getTotal() {
            double total = itens.stream()
                    .mapToDouble(item -> item.total())
                    .reduce(0, (acc, preco) -> acc + preco);
            return total;
        }
    }

    public class Item{
        double quant;
        Mercado.Produto prod;

        double total(){
            return quant * prod.preco;
        }
        public double getPreco() {
            return this.prod.preco;
        }
    }

    public class Produto{
        double preco;
        String dataVencimento;
        String descricao;
    }
}
