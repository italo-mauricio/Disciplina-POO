import 'Pessoa.dart';

// trabalhando com construtores em dart


void main() {
  Carro carro = new Carro("Ferrari", "Spider");
  Cliente cliente = new Cliente("Italo", "Masculino", "0311234232", 24, 1.85);
  print(cliente.cpf);
  print(carro.marca);
}


class Carro {
  String marca = "";
  String modelo = "";
  Carro(this.marca, this.modelo);
}

class Cliente {
  String nome = "";
  String sexo = "";
  String cpf = "";
  int _idade = 0;
  double _altura = 0;

  Cliente(this.nome, this.sexo, this.cpf, this._idade, this._altura);

  Cliente.nascer(this.nome, this._altura) {
    _idade =
        0; // aqui eu crio um construtor com o nome, fazendo um nenem que tem idade 0
  }

  // testando os getters e setters no dart

  int get idade => _idade;

  set idade(int idade) {
    if (idade > 0) {
      _idade = idade;
    }
  }

  double get altura => _altura;

  set altura(double altura) {
    if (altura > 1.45 && altura <= 3.0) {
      _altura = altura;
    }
  }
}

