class Animal {
  String nome = "";
  double peso = 0;

  void comer() {
    print("$nome comeu!");
  }

  void fazerSom() {
    print("$nome fez algum som!");
  }
}

class Cachorro extends Animal {
  int fofura = 0;

  void brincar() {
    fofura += 10;
    print("A fofura do $nome aumentou para $fofura");
  }
}

class Gato extends Animal {
  bool estarAmigavel() {
    return true;
  }
}
