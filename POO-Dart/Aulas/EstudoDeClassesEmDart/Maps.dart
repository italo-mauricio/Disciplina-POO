void main() {
  Map<int, String> dds = Map();

  dds[11] = "São Paulo";
  dds[81] = "Pernambuco";
  dds[84] = "Rio Grande do Norte";

  Map<String, dynamic> pessoa = Map();
  pessoa["nome"] = "italo";
  pessoa["idade"] = 24;
  pessoa["altura"] = 1.75;

  Map<String, InfoPessoa> pessoas = Map();
  pessoas["Pedro"] = InfoPessoa(45);
 

  print(dds.keys);
  print(dds.values);
  print(pessoa.keys);
  print(pessoa.values);
  print(pessoas.keys);

}

class InfoPessoa {
  int idade = 0;
  InfoPessoa(this.idade);
}
