public class OperacaoBasicaTeste {
    public static boolean testar_soma() {
        return OperacaoBasica.somar(3, 5) == 8 ? true : false;
    }

    public static boolean testar_subtracao() {
        return OperacaoBasica.subtrair(5, 3) == 2 ? true : false;
    }


    public static boolean testar_multiplicacao() {
        return OperacaoBasica.multiplicar(3, 5) == 15 ? true : false;
    }

    public static boolean testar_divisao() {
        return OperacaoBasica.dividir(9,3) == 3 ? true : false;
    }
}
