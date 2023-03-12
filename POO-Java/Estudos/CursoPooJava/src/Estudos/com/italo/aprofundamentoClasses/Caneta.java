package Estudos.com.italo.aprofundamentoClasses;

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampado;


    void status(){
        System.out.println("Está tampada? " + this.tampado);
    }


    void rabiscar(){
        if(this.tampado){
            System.out.println("Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }


    void tampar(){
        this.tampado = true;
    }


    void destampar(){
        this.tampado = false;
    }

}
