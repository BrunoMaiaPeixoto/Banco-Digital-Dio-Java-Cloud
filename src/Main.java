public class  Main {
    public static void main(String[] args) {

    Conta cc =  new ContaCorrente();
    cc.depositar(100);

    Conta cp =  new Contapoupanca();
        cc.transferir(100, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
    }
}
