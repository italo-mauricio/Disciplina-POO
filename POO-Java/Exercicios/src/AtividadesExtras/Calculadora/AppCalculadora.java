package AtividadesExtras.Calculadora;

import java.util.Scanner;



public class AppCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        do {
            tela();
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite a quantidade de números que deseja calcular: ");
                int qtdNumeros = scan.nextInt();

                double[] numeros = new double[qtdNumeros];

                for (int i = 0; i < qtdNumeros; i++) {
                    System.out.printf("Digite o %dº número: ", i+1);
                    numeros[i] = scan.nextDouble();
                }

                double resultado = 0.0;


                switch (opcao) {
                    case 1 -> resultado = Calculadora.soma(numeros);
                    case 2 -> resultado = Calculadora.subtracao(numeros);
                    case 3 -> resultado = Calculadora.divisao(numeros);
                    case 4 -> resultado = Calculadora.multiplicacao(numeros);
                }

                System.out.printf("Resultado: %.2f\n", resultado);
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scan.close();
    }

    private static void tela() {
        Screen tela = new Screen();

    }
}




