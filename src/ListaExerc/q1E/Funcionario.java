package ListaExerc.q1E;

public class Funcionario {
    String nome;
    String nascimento;
    int rg;
    int cpf;
    String endereco;
    String naturalidade;
    double salario;
    String profissao;
    int grauInstrucao;
    int matricula;

    public void printDados(){
        System.out.println("NOME: "+this.nome);
        System.out.println("RG: "+this.rg);
        System.out.println("CPF: "+this.cpf);
        System.out.println("NASCIMENTO: "+this.nascimento);
        System.out.println("ENDEREÇO: "+this.endereco);
        System.out.println("NATURALIDADE"+this.naturalidade);
        System.out.println("PROFISSAO: "+this.profissao);
        System.out.println("GRAU DE INSTRUCAO: "+this.grauInstrucao);
        System.out.println("SALARIO:"+this.salario);
        System.out.println("MATRICULA:"+this.matricula);

    }

    public void cadastrarFuncionario(String nome, String nascimento, int rg, int cpf, String endereco, String naturalidade, double salario, String profissao, int grauInstrucao, int matricula) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        System.out.println("CADASTRO CONCLUIDO");
    }
    public void editarFuncionario(String nome, String nascimento, int rg, int cpf, String endereco, String naturalidade, double salario, String profissao, int grauInstrucao, int matricula) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        System.out.println("EDIÇÃO CONCLUIDA");
    }
}
