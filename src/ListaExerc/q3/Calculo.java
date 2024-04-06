package ListaExerc.q3;

import java.util.Scanner;

public class Calculo {
    double num1;
    double num2;

    public void soma(double num1, double num2){
        System.out.println("Soma dos numeros");
        double som=num1+num2;
        System.out.println("Resultado da soma: "+som);
    }
    public void subtrair(double num1, double num2){
        System.out.println("Subtração dos numeros");
        double sub=num1-num2;
        System.out.println("Resultado da Subtração: "+sub);
    }
    public void dividir(double num1, double num2){
        System.out.println("Divisão dos numeros");
        double div=num1/num2;
        System.out.println("Resultado da divisao: "+div);
    }
    public void multiplicar(double num1, double num2){
        System.out.println("Multiplicação dos numeros");
        double multpl=num1*num2;
        System.out.println("Resultado da multiplicação: "+multpl);
    }
    public void printmenu(double num1, double num2){
        Scanner scan=new Scanner(System.in);
        int opEscolhida;
        do{
            System.out.println("### MENU ###");
            System.out.println("[1]-Adição");
            System.out.println("[2]-Subtração");
            System.out.println("[3]-Multiplicação");
            System.out.println("[4]-Divisão");
            System.out.println("[5]-SAIR");
            System.out.println("Decisão: ");
            opEscolhida= scan.nextInt();

            switch (opEscolhida){
                case 1:
                    soma(num1, num2);
                    break;
                case 2:
                    subtrair(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:
                    dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Você decidiu encerrar o programa.");
                    return;
                default:
                    System.out.println("Numero invalido. Tente novamente");
                    return;
            }
        }while (opEscolhida!=5);

        scan.close();
    }

}
