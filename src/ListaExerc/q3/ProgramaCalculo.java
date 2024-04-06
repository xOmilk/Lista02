package ListaExerc.q3;
import java.util.Scanner;
public class ProgramaCalculo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Calculo calcula= new Calculo();
        System.out.println("Calculadora em Java!");
        System.out.println("\nDigite o primeiro numero");
        calcula.num1=scan.nextDouble();
        System.out.println("\nDigite o segundo numero");
        calcula.num2=scan.nextDouble();

        calcula.printmenu(calcula.num1, calcula.num2);


    }
}
