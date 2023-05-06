public class Conta {
    private double saldo;
    public double getSaldo()
    {
        return saldo;
    }
    public void depositar(double valor)
    {
        saldo = saldo + valor;
    }
    public void sacar(double valor)
    {   if(saldo > valor)
        saldo = saldo - valor;
        else
            System.out.println("Saldo atual da conta é insuficiente para sacar: ");
    }
    public Conta(double saldoInicial)
    {
        saldo = saldoInicial;
    }
}
