package ListaExerc.q1C;

public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal a1= new Animal();
        Animal a2= new Animal();

        a1.cadastrarAnimal("Aedes","22/05/2000","Mosquitão",4657,"Ifba");
        a2.cadastrarAnimal("Girafa","08/09/2024","Cleiton",9087,"Cativeiro");

        System.out.println("Informações primeiro animal antes da alteração");
        a1.printStatus();
        System.out.println("Informações segundo animal antes da alteração");
        a2.printStatus();

        a1.editarAnimal("Girafa","08/09/2024","Cleiton",9087,"Cativeiro");
        a2.editarAnimal("Aedes","22/05/2000","Mosquitão",4657,"Ifba");
        System.out.println("\nCaracteristicas dos animais foram trocadas!!\n");

        System.out.println("Informações primeiro animal DEPOIS da alteração");
        a1.printStatus();
        System.out.println("Informações segundo animal DEPOIS da alteração");
        a2.printStatus();

    }
}
