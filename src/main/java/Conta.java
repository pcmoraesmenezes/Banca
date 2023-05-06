public class Conta {
    private double saldo;
    public double getSaldo()
    {
        return saldo;
    }
    public boolean depositar(double valor)
    {
        saldo = saldo + valor;
        return true;
    }
    public boolean sacar(double valor)
    {   if(saldo > valor) {
        saldo = saldo - valor;
        return true;
    }
        else
        return false;
    }
    public Conta(double saldoInicial)
    {
        saldo = saldoInicial;
    }
}
