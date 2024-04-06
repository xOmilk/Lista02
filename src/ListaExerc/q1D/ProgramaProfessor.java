package ListaExerc.q1D;

public class ProgramaProfessor {
    public static void main(String[] args) {
        Professor p1= new Professor();
        Professor p2= new Professor();

        p1.cadastrarProfessor("Homer","Doutor", "SI",40, 10000);
        p2.cadastrarProfessor("Nielsen", "Mestre", "Matematica", 36, 7000);

        p1.editarAtuacao("Atua na parte de programação ensinando online");
        p2.editarAtuacao("Atua Ensinando em Escolas");


        System.out.println("DADOS PRIMEIRO PROFESSOR");
        p1.printDados();
        System.out.println("DADOS SEGUNDO PROFESSOR");
        p2.printDados();

        p1.editarProfessor("Homer","Doutor", "SI",20, 5000);
        p2.editarProfessor("João", "Mestre", "Matematica", 45, 12000);

        System.out.println("DADOS PRIMEIRO PROFESSOR APOS ALTERACAO");
        p1.printDados();
        System.out.println("DADOS SEGUNDO PROFESSOR APOS ALTERACAO");
        p2.printDados();

    }
}
