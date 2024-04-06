package ListaExerc.q1C;

public class Animal {
    String especie;
    String nascimento;
    String nome;
    int numRegistro;
    String localNascimento;

    public void printStatus(){
        System.out.println("NOME: "+this.nome);
        System.out.println("ESPECIE: "+this.especie);
        System.out.println("NASCIMENTO: "+this.nascimento);
        System.out.println("NUMERO DE REGISTRO: "+this.numRegistro);
        System.out.println("LOCAL DE NASCIMENTO: "+this.localNascimento);
    }

    public void cadastrarAnimal(String especie, String nascimento, String nome, int numRegistro, String localNascimento) {
        this.especie = especie;
        this.nascimento = nascimento;
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;
        System.out.println("CADASTRO CONCLUIDO");
    }
    public void editarAnimal(String especie, String nascimento, String nome, int numRegistro, String localNascimento) {
        this.especie = especie;
        this.nascimento = nascimento;
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;
        System.out.println("EDIÇÃO CONCLUIDA");
    }
}
