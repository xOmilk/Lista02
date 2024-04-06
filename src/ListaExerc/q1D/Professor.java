package ListaExerc.q1D;

public class Professor {
    String nome;
    String titulacao;
    String formacao;
    float cargaHoraria;
    double salario;
    String areaAtuacao;

    public void printDados(){
        System.out.println("NOME: "+this.nome);
        System.out.println("TITULACÃO: "+this.titulacao);
        System.out.println("FORMAÇÃO: "+this.formacao);
        System.out.println("CARGA HORARIA: "+this.cargaHoraria);
        System.out.println("SALARIO: "+this.salario);
        System.out.println("AREA DE ATUAÇÃO: "+this.areaAtuacao);

    }

    public void cadastrarProfessor(String nome, String titulacao, String formacao, float cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        System.out.println("\nCADASTRO CONCLUIDO");
    }
    public void editarProfessor(String nome, String titulacao, String formacao, float cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        System.out.println("\nEDIÇÃO CONCLUIDA");
    }
    public void editarAtuacao(String areaAtuacao){
        this.areaAtuacao=areaAtuacao;
        System.out.println("\nEDIÇÃO CONCLUIDA");
    }
}
