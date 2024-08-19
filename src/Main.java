//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Luis Gustavo");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(250.0);
        cc.transferir(100.0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}