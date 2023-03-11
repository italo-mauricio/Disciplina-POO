import 'dart:io';
import '../../Validacoes/Validacoes.dart';


class Pessoa{
  String nome = "";
  int idade = 0;
  String cpf = "";
  double altura = 0;

  void dormir(){
    print("$nome está dormindo!");
  }

  void aniversario(){
    idade++;
  }

}

void main(){


  Pessoa pessoa = new Pessoa();  // inicializando a classe

  do {

    // aqui utilizei o do while pois a validação está 100% funcional para STRING
    stdout.write("Digite o seu nome: ");
    pessoa.nome = stdin.readLineSync()!;
  }while(!validaString(pessoa.nome));

while (true) {

  // tive que usar uma "gambiarra" pois a validção estava fechando o programa
  stdout.write("Digite sua idade: ");
  var entrada = stdin.readLineSync();
  try {
    pessoa.idade = int.parse(entrada!);
    if (validaNumInt(pessoa.idade)) {
      break;
    }
  } catch (e) {
  }
  print("Entrada inválida. A idade deve ser um número inteiro.");
}

  stdout.write("Digite o seu cpf: ");
  pessoa.cpf = stdin.readLineSync()!;
  stdout.write("Digite sua altura: ");
  pessoa.altura = double.parse(stdin.readLineSync()!);

  print("Seu nome é: ${pessoa.nome}");
  print("Sua idade é: ${pessoa.idade}");
  print("Seu CPF é: ${pessoa.cpf}");
  print("Sua altuera é de: ${pessoa.altura}");
  
}

// Ao utilizar o ! após a chamada da função readLineSync(), estamos informando ao compilador que temos certeza de que o valor retornado nunca será nulo. Com isso, o valor é atribuído à variável nome sem problemas.