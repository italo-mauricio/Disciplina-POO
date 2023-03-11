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





bool validacpf(String cpf) {
  if (cpf == null || cpf.isEmpty) {
    return false;
  }

  final cleanedCpf = cpf.replaceAll(RegExp(r'[^\d]'), '');

  if (cleanedCpf.length != 11) {
    return false;
  }

  final digits = cleanedCpf.split('').map((digit) => int.parse(digit)).toList();
  
  // primeira verificação de dígito
  var sum = 0;
  for (var i = 0; i < 9; i++) {
    sum += digits[i] * (10 - i);
  }

  var verificationDigit = (sum * 10) % 11;
  if (verificationDigit == 10) {
    verificationDigit = 0;
  }

  if (verificationDigit != digits[9]) {
    return false;
  }

 // segunda verificação de dígito
  sum = 0;
  for (var i = 0; i < 10; i++) {
    sum += digits[i] * (11 - i);
  }

  verificationDigit = (sum * 10) % 11;
  if (verificationDigit == 10) {
    verificationDigit = 0;
  }

  if (verificationDigit != digits[10]) {
    return false;
  }

  return true;
}