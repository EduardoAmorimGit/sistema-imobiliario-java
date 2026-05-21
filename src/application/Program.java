package application;
import entities.Imovel;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Imovel imovel1 = new Imovel(1, "Rua Esperança", 1850.0, "Casa", true, 75);

        System.out.println(imovel1.getEndereco());
        System.out.println(imovel1.getValor());
        System.out.println(imovel1.isDisponivel());

        Imovel imovel2 = new Imovel(2, "Rua sacarrão", 2500.0, "Apartamento", true, 110);

        Imovel imovel3 = new Imovel(3, "Rua manhuaçu", 1000.0, "Casa", false, 60);

        ArrayList<Imovel> listaImoveis = new ArrayList<>();

        listaImoveis.add(imovel1);
        listaImoveis.add(imovel2);
        listaImoveis.add(imovel3);

        for (Imovel imoveis:listaImoveis) {
            System.out.println(imoveis.getEndereco());
            System.out.println(imoveis.getValor());
            System.out.println(imoveis.isDisponivel());

        }
    }
}
