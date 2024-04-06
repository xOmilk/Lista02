package ListaExerc.q1E;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario f1= new Funcionario();
        Funcionario f2= new Funcionario();




        f1.cadastrarFuncionario("Fernando","10/11/1990",4665,765445,"Casa da mae joana","Brasileiro",1000,"Faz tudo",1,4564);
        f2.cadastrarFuncionario("Lucas","11/10/1960",3564576,467,"barreiras","estadunidense",1,"faz nada",1,4564);

        System.out.println("\nINFORMACOES DO PRIMEIRO FUNCIONARIO");
        f1.printDados();
        System.out.println("\nINFORMACOES DO SEGUNDO FUNCIONARIO");
        f2.printDados();

        f1.editarFuncionario("Fernando","22/11/2003",4665,765445,"rua da barra","Brasileiro",8000,"Faz tudo",1,4564);
        f2.editarFuncionario("Lucas","11/10/1960",3564576,467,"Salvador","Brasileiro",1100,"Caixa",2,79564);

        System.out.println("\nINFORMACOES DO PRIMEIRO FUNCIONARIO APOS A ALTERACAO");
        f1.printDados();
        System.out.println("\nINFORMACOES DO SEGUNDO FUNCIONARIO APOS A ALTERACAO");
        f2.printDados();
    }
}
