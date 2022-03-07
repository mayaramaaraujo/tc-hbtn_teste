public class OperacaoBasica {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static int sqrt(int a) {
        int n = 0;
        while ((n * n) != a) {
            n++;
        }
        return n;
    }

    public static String numero_primo(int a) {
        if(a <= 1) {
            return "Número invalido. Numero menor ou igual a 1 não é primo";
        }

        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                return "Número válido, mas o numero não é primo" ;
            }
        }

        return "Numero válido, o numero é primo";
    }

}
