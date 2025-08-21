package Lab3;

public class Account {

    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    private double limite;

    public Account() {}

    public Account(int numeroConta, String nomeCorrentista, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void imprimir() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
        System.out.println("-----------------------------");
    }
}