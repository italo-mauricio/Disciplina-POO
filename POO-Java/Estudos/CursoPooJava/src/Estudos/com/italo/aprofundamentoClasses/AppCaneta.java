package Estudos.com.italo.aprofundamentoClasses;

import java.util.Scanner;

public class AppCaneta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Caneta caneta = new Caneta();
        caneta.cor = "azul";
        caneta.ponta = 0.5;
        caneta.tampar();
        caneta.status();
        caneta.rabiscar();
        caneta.destampar();
        caneta.status();
        caneta.rabiscar();
    }
}
