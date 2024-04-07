package ListaExerc.q1B;

public class ProgramaPoupanca {
    public static void main(String[] args) {
        ContaPoupanca conta1= new ContaPoupanca();
        ContaPoupanca conta2= new ContaPoupanca();

        conta1.cadastrarConta("Antonio",0000,01010,5,9485,8080);
        conta2.cadastrarConta("Joao",99909234,46786,20000,1234,9024);

        System.out.println("Saldo da Primeira conta antes da alteracao");
        conta1.imprimirSaldo();

        System.out.println("Saldo da Segunda conta antes da alteracao");
        conta2.imprimirSaldo();

        System.out.println("Passar os dados de um pra outro");

        conta1.editarConta("Cesar",9999,56,30000,4676,1010);
        conta2.editarConta("Antonio",0000,01010,5,9485,8080);

        System.out.println("Primeiro conta DEPOIS da alteracao");
        conta1.imprimirSaldo();

        System.out.println("Segunda conta DEPOIS da alteracao");
        conta2.imprimirSaldo();


    }
}
