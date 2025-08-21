package Lab3;

public class AccountTest {
    public static void main(String[] args) {

        Account conta1 = new Account();
        Account conta2 = new Account();
        Account conta3 = new Account();

        conta1.setNumeroConta(1001);
        conta1.setNomeCorrentista("João");
        conta1.setSaldo(1500.0);
        conta1.setLimite(500.0);

        conta2.setNumeroConta(1002);
        conta2.setNomeCorrentista("Vítor");
        conta2.setSaldo(2500.0);
        conta2.setLimite(1000.0);

        conta3.setNumeroConta(1003);
        conta3.setNomeCorrentista("Guimarães");
        conta3.setSaldo(3000.0);
        conta3.setLimite(1500.0);

        System.out.println("=== Informações das Contas ===");
        conta1.imprimir();
        conta2.imprimir();
        conta3.imprimir();
    }
}
