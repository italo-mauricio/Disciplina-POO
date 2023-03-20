package AtividadesExtras.Calculadora;

class Calculadora{
    public static double soma(double[] numeros) {
        double resultado = 0.0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static double subtracao(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static double multiplicacao(double[] numeros) {
        double resultado = 1.0;
        for (double numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    public static double divisao(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado /= numeros[i];
        }
        return resultado;
    }

    public static double potencia(double[] numeros){
        double resultado = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            resultado = Math.pow(numeros[0], numeros[i]);

        }
        return resultado;
    }


}