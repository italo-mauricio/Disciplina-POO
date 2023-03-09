package AtividadesPrimeiraUnidade.Atividade1;

import java.util.Date;
import java.util.List;


public class Mercado{


    public static Mercado.Produto Produto;

    public static class Vendas{
            Date dataAtual = new Date();
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

            public Produto(double preco, String dataVencimento, String descricao){
                this.preco = preco;
                this.dataVencimento = dataVencimento;
                this.descricao = descricao;
            }


        }

    }



