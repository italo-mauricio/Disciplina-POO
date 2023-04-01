import 'Pessoa.dart';

// trabalhando com construtores em dart

class Carro {
  String marca = "";
  String modelo = "";
  Carro(this.marca, this.modelo);
}

class Cliente {
  String nome = "";
  String sexo = "";
  String cpf = "";
  int idade = 0;
  double altura = 0;

  Cliente(this.nome, this.sexo, this.cpf, this.idade, this.altura);

  Cliente.nascer(this.nome, this.altura) {
    idade = 0;  // aqui eu crio um construtor com o nome, fazendo um nenem que tem idade 0
  }
}

void main() {
  Carro carro = new Carro("Ferrari", "Spider");
  Cliente cliente = new Cliente("Italo", "Masculino", "0311234232", 24, 1.85);
  print(cliente.cpf);
  print(carro.marca);
}
