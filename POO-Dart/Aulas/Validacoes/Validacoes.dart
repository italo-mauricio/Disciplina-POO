import 'dart:ffi';



// Validações padrões


bool validaString(String? string) {
  if (string == null || string.isEmpty) {
    return false;
  }
  RegExp regExp = new RegExp(r'^[a-zA-Z\s-]+$');
  return regExp.hasMatch(string);
}



bool validaNumInt(int? num){
  if (num == null) {
    return false;
  }
  RegExp regExp = new RegExp(r'^[0-9]+$'); 
  return regExp.hasMatch(num.toString());
}


bool validaNumDouble(double? num){
  if (num == null) {
    return false;
  }
  RegExp regExp = new RegExp(r'^[0-9]+$'); 
  return regExp.hasMatch(num.toString());
}


bool validaNumFloat(Float? num){
  if (num == null) {
    return false;
  }
  RegExp regExp = new RegExp(r'^[0-9]+$'); 
  return regExp.hasMatch(num.toString());
}



bool validaCPF(String cpf) {

  // Remove caracteres não-numéricos
  cpf = cpf.replaceAll(RegExp(r'[^0-9]'), '');

  // Verifica se o CPF tem 11 dígitos
  if (cpf.length != 11) {
    return false;
  }

  // Calcula os dois dígitos verificadores
  int digito1 = 0;
  int digito2 = 0;
  for (int i = 0; i < 9; i++) {
    digito1 += int.parse(cpf[i]) * (10 - i);
    digito2 += int.parse(cpf[i]) * (11 - i);
  }
  digito1 = (digito1 * 10) % 11;
  if (digito1 == 10) {
    digito1 = 0;
  }
  digito2 = (digito2 + digito1 * 2) % 11;
  if (digito2 == 10) {
    digito2 = 0;
  }

  // Verifica se os dígitos calculados são iguais aos dois últimos dígitos do CPF
  if (digito1 == int.parse(cpf[9]) && digito2 == int.parse(cpf[10])) {
    return true;
  } else {
    return false;
  }
}

