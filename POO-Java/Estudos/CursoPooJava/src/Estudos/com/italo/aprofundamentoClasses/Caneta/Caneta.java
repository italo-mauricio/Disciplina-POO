package Estudos.com.italo.aprofundamentoClasses.Caneta;

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampado;


    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
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
