package EstudoCaso.q1;
import java.util.Scanner;

public class Carro {
    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;
    private boolean ligado;


    public Carro(String modelo, double aceleracao) {
        this.modelo = modelo;
        this.aceleracao = aceleracao;
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }
    public void funcoesCarro(){
        Scanner scan=new Scanner(System.in);
        int funcao;
        do{
            System.out.println("[1]-Ligar");
            System.out.println("[2]-Desligar");
            System.out.println("[3]-Acelerar");
            System.out.println("[4]-Desacelerar");
            System.out.println("[5]-Virar esquerda");
            System.out.println("[6]-virar direita");
            System.out.println("[7]-Subir marcha");
            System.out.println("[8]-Descer marcha");
            System.out.println("[9]-SAIR DO CARRO");
            System.out.println("Função escolhida:");
            funcao=scan.nextInt();

            switch (funcao){
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    acelerar();
                    break;
                case 4:
                    desacelerar();
                    break;
                case 5:
                    virarEsquerda();
                    break;
                case 6:
                    virarDireita();
                    break;
                case 7:
                    marchaCima();
                    break;
                case 8:
                    marchaBaixo();
                    break;
                case 9:
                    System.out.println("Voce decidiu sair do carro.");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }while (funcao!=9);
    }


    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
        this.marcha=0;
    }


    public void acelerar() {
        if (ligado) {
            velocidade += aceleracao;
            System.out.println("Carro acelerando. Velocidade atual: " + velocidade);
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public void desacelerar() {
        if (ligado) {
            velocidade -= aceleracao;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("Carro desacelerando. Velocidade atual: " + velocidade);
        } else {
            System.out.println("O carro precisa estar ligado para desacelerar.");
        }
    }


    public void virarEsquerda() {
        if (ligado) {
            System.out.println("Carro virando à esquerda.");
        } else {
            System.out.println("O carro precisa estar ligado para virar à esquerda.");
        }
    }

    public void virarDireita() {
        if (ligado) {
            System.out.println("Carro virando à direita.");
        } else {
            System.out.println("O carro precisa estar ligado para virar à direita.");
        }
    }


    public void marchaCima() {
        if (ligado) {
            marcha++;
            System.out.println("Marcha aumentada para: " + marcha);
        } else {
            System.out.println("O carro precisa estar ligado para mudar a marcha.");
        }
    }

    public void marchaBaixo() {
        if (ligado && marcha > 0) {
            marcha--;
            System.out.println("Marcha diminuída para: " + marcha);
        } else {
            System.out.println("O carro precisa estar ligado e em uma marcha acima de 0 para mudar a marcha.");
        }
    }

}

