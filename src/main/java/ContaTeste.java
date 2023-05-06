public class ContaTeste {
    public static void main(String [] args)
    {
        Conta conta;
        Cliente cliente = new Cliente("Paulo","Cesar");
        System.out.println("Criando o cliente " + cliente.getNome() + " "+ cliente.getSobrenome());
        System.out.println("Criando uma conta com saldo de R$ 50.000,00 para o cliente " + cliente.getNome() + " " +cliente.getSobrenome() );

        conta = new Conta(50000);
        cliente.setConta(conta);

        System.out.println("Sacando R$ 1200,00: "+conta.sacar(1200));

        System.out.println("Depositando R$ 8.525,00: "+conta.depositar(8525));


        System.out.println("Sacando R$ 12.800,00: "+ conta.sacar(12800));

        System.out.println("Sacando R$ 50.000,00: "+  conta.sacar(5000000));

        System.out.println("O saldo da conta é R$"+conta.getSaldo());
    }
}
