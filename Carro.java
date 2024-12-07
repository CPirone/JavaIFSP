public class Carro {

    int Ano;
    String marca, modelo, cor;

    public Carro(int Ano, String marca, String modelo, String cor){

        this.Ano = Ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public static void main(String args[]) {

        Carro car1 = new Carro(1900, "VW", "Fusca", "Azul");
        
        car1.exibirModelo();
        car1.exibirAnoECor();

        Carro car2 = new Carro(2000, "Ford", "Fiesta", "Vermelho");
        
        car2.exibirModelo();
        car2.exibirAnoECor();

        Carro mycar = new Carro(2015,"Toyota", "Corolla", "Preto");

        mycar.exibirModelo();
        mycar.exibirAnoECor();

    }

    public void exibirModelo() {
        System.out.println(modelo);
    }

    public void exibirAnoECor() {
        System.out.println("Ano: " + Ano + " Cor: " + cor);
    }
}
