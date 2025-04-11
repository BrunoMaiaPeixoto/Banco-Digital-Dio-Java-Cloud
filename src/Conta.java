public abstract class Conta implements IConta {

    private int agencia;
    private int numero;
    private double saldo;

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void sacar(double valor) {

    }

    public void sacar() {

    }

    public void transferir() {

    }

    public void depositar() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}

