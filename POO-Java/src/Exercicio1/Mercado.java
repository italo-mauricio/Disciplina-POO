package src.Exercicio1;

import java.util.List;

public class Mercado {
    public class Vendas{
        String data;
        List<Item> itens;

        double getTotal() {
            double total = itens.stream()
                    .mapToDouble(item -> item.total())
                    .reduce(0, (acc, preco) -> acc + preco);
            return total;
        }
    }

    public class Item{
        double quant;
        Produto prod;

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
        double descricao;
    }
}

