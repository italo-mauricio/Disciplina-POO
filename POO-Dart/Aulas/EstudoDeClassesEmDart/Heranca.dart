void main() {
  Cachorro cachorro = new Cachorro("Billy", 10, 100);
  Gato gato = new Gato("xaninho", 5);

  gato.comer();
  cachorro.fazerSom();
  print(cachorro);
}

class Animal {
  String nome = "";
  double peso = 0;

  Animal(this.nome, this.peso);

  void comer() {
    print("$nome comeu!");
  }

  void fazerSom() {
    print("$nome fez algum som!");
  }
}

class Cachorro extends Animal {
  int fofura = 0;

  Cachorro(String nome, double peso, this.fofura) : super(nome, peso);
  void brincar() {
    fofura += 10;
    print("A fofura do $nome aumentou para $fofura");
  }

  @override
  void fazerSom() {
    print("$nome fez auau!");
  }

  @override
  String toString() {
    return "Cachorro || Nome: $nome, Peso: $peso, Fofura: $fofura";
  }
}

class Gato extends Animal {
  Gato(String nome, double peso) : super(nome, peso);

  bool estarAmigavel() {
    return true;
  }

  @override
  void fazerSom() {
    print("$nome fez miau!");
  }
}
