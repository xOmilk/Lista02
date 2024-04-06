package EstudoCaso.q2;

import java.util.Scanner;

public class Televisao {
    float polegadas;
    int volume;
    String marca;
    int voltagem;
    int canal;

    public Televisao(float polegadas, String marca, int voltagem) {
        this.polegadas = polegadas;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = 0;
    }

    public void funcoesTv(){
        Scanner scan= new Scanner(System.in);
        int funcao;
        do{
            System.out.println("[1]-Ligar");
            System.out.println("[2]-Desligar");
            System.out.println("[3]-Aumentar volume");
            System.out.println("[4]-Diminuir volume");
            System.out.println("[5]-Subir canal");
            System.out.println("[6]-Descer canal");
            System.out.println("[7]-SAIR DA TELEVISÃO");
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
                    aumentarVolume();
                    break;
                case 4:
                    diminuirVolume();
                    break;
                case 5:
                    subirCanal();
                    break;
                case 6:
                    descerCanal();
                    break;
                case 7:
                    System.out.println("Voce decidiu sair da televisão.");
                    break;
                default:
                    System.out.println("Numero invalido, tente novamente.");
                    break;
            }


        }while (funcao!=7);
    }


    public void ligar() {
        float consumo = this.polegadas * this.voltagem;
        System.out.println("Ligando...\nO consumo total da televisão é: " + consumo);
    }

    public void desligar() {
        System.out.println("Televisão desligada...");
    }

    public void aumentarVolume() {
        if (this.volume < 10) {
            ++this.volume;
            System.out.println("O volume atual é: " + this.volume);
        } else if (this.volume == 10) {
            System.out.println("O volume já está no máximo\nO volume atual é: "+this.volume);
        }
    }

    public void diminuirVolume() {
        if (this.volume >= 1) {
            --this.volume;
            System.out.println("Voce aumentou o volume\nO volume atual é: " + this.volume);
        }else{
            System.out.println("Não pode ficar com o volume da televisão negativo, o volume atual é:"+this.volume);
        }
    }

    public void subirCanal() {
        ++this.canal;
        System.out.println("O canal atual é: " + this.canal);
    }

    public void descerCanal() {
        if (this.canal!=0) {
            --this.canal;
            System.out.println("Você subiu de canal\nO canal atual é: " + this.canal);
        }else{
            System.out.println("Você nao pode descer pra um canal negativo!");
            System.out.println("O canal atual é: " + this.canal);
        }
    }


}

