package ListaExerc.q1B;

public class ContaPoupanca {
    String nome;
    int cpf;
    int rg;
    double saldo;
    int numero;
    int agencia;

    public void cadastrarConta(String nome, int cpf, int rg, double saldo, int numero, int agencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("CADASTRADO COM SUCESSO!");
    }

    public void editarConta(String nome, int cpf, int rg, double saldo, int numero, int agencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("EDITADO COM SUCESSO!");
    }

    public void imprimirSaldo(){
        System.out.println("O saldo do correntista "+this.nome+" é :"+this.saldo);
    }

}
