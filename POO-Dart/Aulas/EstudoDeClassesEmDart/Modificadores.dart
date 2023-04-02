class Valores {
  static int vezesClicado =
      0; //permite acessar o valor da variável sem uma instancia;
  static String nome = "";
  static double peso = 0;
}

void main() {
  Valores.vezesClicado = 2;
  print(Valores.vezesClicado);

  const int num = 3; // não permite alteração

}
