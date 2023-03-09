package AtividadesPrimeiraUnidade.Atividade1;

import java.util.Date;
import java.util.List;


public class Mercado{


    public static class Vendas{
        Date dataAtual;
        List<Mercado.Item> itens;
        double getTotal() {
            double total = itens.stream()
                    .mapToDouble(item -> item.total())
                    .reduce(0, (acc, preco) -> acc + preco);
            return total;
        }
        void setItem(double quantidade, Produto produto){
            Item item = new Item( quantidade,  produto);
            itens.add(item);
        }


    }

    public static class Item{
        double quantidade;
        Mercado.Produto prod;



        public Item() {

        }

        public Item(double quant, Produto produto) {
            quantidade = quant;
            prod = produto;
        }


        double total(){
            return quantidade * this.prod.preco;
        }
        public double getPreco() {
            return this.prod.preco;
        }
    }

    public static class Produto{
        double preco;
        String dataVencimento;
        String descricao;
    }

}

