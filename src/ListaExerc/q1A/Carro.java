package ListaExerc.q1A;

public class Carro {
    int codigo;
    String marca;
    String cor;
    String modelo;
    int anoFab;
    String tipoCombustivel;
    int numPortas;
    int qntdDisponivel;
    boolean isBasic;
    public void printStatus(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Marca: "+this.marca);
        System.out.println("Código: "+this.codigo);
        System.out.println("Tipo de combustível: "+this.tipoCombustivel);
        System.out.println("Ano Fabricação: "+this.anoFab);
        System.out.println("num Portas: "+this.numPortas);
        System.out.println("Quantidade disponível: "+this.qntdDisponivel);
        System.out.println("É Básico: "+this.isBasic);

    }

    public void cadastrar(int codigo, String marca, String cor, String modelo, int anoFab, int numPortas, int qntdDisponivel,String tipoCombustivel ,boolean isBasic) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.qntdDisponivel = qntdDisponivel;
        this.tipoCombustivel=tipoCombustivel;
        this.isBasic = isBasic;
        System.out.println("CADASTRO CONCLUIDO");
    }
    public void editar(int codigo, String marca, String cor, String modelo, int anoFab, int numPortas, int qntdDisponivel,String tipoCombustivel ,boolean isBasic) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.numPortas = numPortas;
        this.qntdDisponivel = qntdDisponivel;
        this.tipoCombustivel=tipoCombustivel;
        this.isBasic = isBasic;
        System.out.println("EDIÇÃO CONCLUIDA");
    }
}
