package application;
import entities.Imovel;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
            System.out.println(imoveis);
        }

            System.out.println("Insira os dados do novo imóvel");
            System.out.println("id");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Endereço");
            String endereco = scanner.nextLine();

            System.out.println("Valor");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Tipo");
            String tipo = scanner.nextLine();

            System.out.println("Disponibilidade");
            boolean disponibilidade = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Metragem");
            int metragem = scanner.nextInt();

            Imovel novoImovel = new Imovel(id, endereco, valor, tipo, disponibilidade, metragem);

            listaImoveis.add(novoImovel);

            for (Imovel imoveis:listaImoveis) {
                System.out.println(imoveis);
            }
    }
}
