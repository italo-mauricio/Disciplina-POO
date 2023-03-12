package Estudos.com.italo.aprofundamentoClasses;

import java.util.Scanner;

public class AppCaneta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Caneta caneta = new Caneta();
        caneta.cor = "azul";
        caneta.ponta = 0.5;
        caneta.tampado = false;
        caneta.status();
    }
}
