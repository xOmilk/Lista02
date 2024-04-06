package ListaExerc.q1A;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro c1= new Carro();
        Carro c2= new Carro();

        c1.cadastrar(456,"Ford","Amarelo","Modelo esquisito",2000,4,10,false);
        c2.cadastrar(657,"Geforce","Preto","Do bom",2024,4,5,false);

        System.out.println("Primeiro carro antes da alteracao");
        c1.printStatus();
        System.out.println("\n\nSegundo carro antes da alteracao");
        c2.printStatus();

        c1.editar(555,"AAAAAAAAAAA","Amarelo FOSCO","Modelo menos esquisito", 2000, 4, 9,false);
        c2.editar(456,"Ford","Amarelo","Modelo esquisito",2000,4,10,false);

        System.out.println("\nPassei as caracteristicas originais do primeiro carro para as caracteristicas editadas do segundo carro\n");

        System.out.println("Primeiro carro DEPOIS da alteracao");
        c1.printStatus();
        System.out.println("\n\nSegundo carro DEPOIS da alteracao");
        c2.printStatus();

    }

}
