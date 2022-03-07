public class Program {

    public static void main(String[] args) {

        System.out.println("Testando o metodo testar_sqrt");
        boolean teste = OperacaoBasicaTeste.testar_sqrt();
        System.out.println(teste);

        System.out.println("Testando o metodo testar_primo");
        teste = OperacaoBasicaTeste.testar_primo();
        System.out.println(teste);

        System.out.println("Testando o metodo testar_nao_primo");
        teste = OperacaoBasicaTeste.testar_nao_primo();
        System.out.println(teste);

        System.out.println("Testando o metodo testar_primo_menor_zero");
        teste = OperacaoBasicaTeste.testar_primo_menor_zero();
        System.out.println(teste);
    }
}