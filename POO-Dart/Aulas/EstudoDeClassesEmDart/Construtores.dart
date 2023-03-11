import 'Pessoa.dart';

// trabalhando com construtores em dart

class Carro{
  String marca = "";
  String modelo = ""; 
  Carro(this.marca, this.modelo);
}


void main(){

  Carro carro = new Carro("Ferrari", "Spider");
  print(carro.marca);

}

