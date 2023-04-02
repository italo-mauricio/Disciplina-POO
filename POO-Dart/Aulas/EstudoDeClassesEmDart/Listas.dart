void main() {
  List<String> nomes = ["Italo", "Tallys", "Vinicius", "Lucas"];
  print(nomes[0]);
  nomes.add("Marcelo");
  print(nomes);

  print(nomes.length);

  nomes.remove(0);
  print(nomes);

  nomes.insert(0, "pedro");
  print(nomes);

  print(nomes.contains("jorge"));

  List<Pessoa> pessoas = [];
  
  pessoas.add(Pessoa("Carlos", 30));
  pessoas.add(Pessoa("Brenda", 30));

  for (Pessoa p in pessoas) {
    print(p.nome);
  }
}

class Pessoa {
  String nome = "";
  int idade = 0;

  Pessoa(this.nome, this.idade);
}
