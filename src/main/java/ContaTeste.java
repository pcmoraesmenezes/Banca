public class ContaTeste {
    public static void main(String [] args)
    {
        Conta conta;
        System.out.println("Criando uma conta com saldo inicial de R$ 22.00");
        conta = new Conta(22.00);
        System.out.println("Sacando R$ 13.00");
        conta.sacar(13.00);
        System.out.println("Depositando R$ 17.00");
        conta.depositar(17.00);
        System.out.println("O saldo da conta é R$"+conta.getSaldo());
    }
}
