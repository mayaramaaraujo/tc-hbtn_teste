public class Program {

    public static void main(String[] args) {

        System.out.println("Testando a somar");
        boolean teste = OperacaoBasicaTeste.testar_soma();
        System.out.println(teste);

        System.out.println("Testando a subtracao");
        teste = OperacaoBasicaTeste.testar_subtracao();
        System.out.println(teste);

        System.out.println("Testando a multiplicacao");
        teste = OperacaoBasicaTeste.testar_multiplicacao();
        System.out.println(teste);

        System.out.println("Testando a divisao");
        teste = OperacaoBasicaTeste.testar_divisao();
        System.out.println(teste);
    }
}