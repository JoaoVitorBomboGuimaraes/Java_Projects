package Lab3;

public class Account {

    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;
    private double limite;
    private String senha; // variável privada

    // Construtor sem parâmetros
    public Account() {
        this.numeroConta = 0;
        this.nomeCorrentista = "";
        this.saldo = 0.0;
        this.limite = 0.0;
        this.senha = "0000"; // senha padrão
    }

    // Construtor com parâmetros (saldo sempre 0.0 e senha padrão "0000")
    public Account(int numeroConta, String nomeCorrentista, double limite) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
        this.limite = limite;
        this.senha = "0000";
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

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Método de depósito
    public boolean deposit(double value) {
        if (value > 0) {
            saldo += value;
            return true;
        }
        return false;
    }

    // Método de saque
    public boolean withdraw(double value) {
        if (value <= 0) return false;

        if (saldo + limite >= value) {
            saldo -= value;
            return true;
        }
        return false;
    }

    // Método de troca de senha
    public boolean changePassword(String oldPass, String newPass) {
        if (this.senha.equals(oldPass)) {
            this.senha = newPass;
            return true;
        }
        return false;
    }

    public void imprimir() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
        System.out.println("-----------------------------");
    }
}