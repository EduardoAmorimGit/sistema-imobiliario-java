package application;
import entities.Imovel;

public class Program {

    public static void main(String[] args) {

        Imovel imovel1 = new Imovel(1, "Rua Esperança", 1850.0, "Casa",true, 75);

        System.out.println(imovel1.getEndereco());
        System.out.println(imovel1.getValor());
        System.out.println(imovel1.isDisponivel());

    }
}
