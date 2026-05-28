package application;
import entities.Imovel;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Imovel imovel1 = new Imovel(1, "Rua Esperança", 1850.0, "Casa", true, 75);

        Imovel imovel2 = new Imovel(2, "Rua sacarrão", 2500.0, "Apartamento", true, 110);

        Imovel imovel3 = new Imovel(3, "Rua manhuaçu", 1000.0, "Casa", false, 60);

        ArrayList<Imovel> listaImoveis = new ArrayList<>();

        listaImoveis.add(imovel1);
        listaImoveis.add(imovel2);
        listaImoveis.add(imovel3);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("-=- Escolha uma opção -=-");

            System.out.println("Opção 1 - Criar Imóvel");
            System.out.println("Opção 2 - Excluir Imóvel");
            System.out.println("Opção 3 - Listar Imóveis");
            System.out.println("Opção 0 - Encerrar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
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

                    System.out.println("Disponibilidade (Sim) ou (Não)");
                    String resposta = scanner.nextLine();

                    boolean disponibilidade;

                    if (resposta.equalsIgnoreCase("Sim")) {
                        disponibilidade = true;
                    } else {
                        disponibilidade = false;
                    }

                    System.out.println("Metragem");
                    int metragem = scanner.nextInt();

                    Imovel novoImovel = new Imovel(id, endereco, valor, tipo, disponibilidade, metragem);

                    listaImoveis.add(novoImovel);
                    System.out.println("Imóvel cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Digite o ID que você deseja selecionar");
                    int buscaid = scanner.nextInt();

                    for (int i = 0; i < listaImoveis.size(); i++) {
                        listaImoveis.get(i);
                        if (listaImoveis.get(i).getId() == buscaid) {
                            listaImoveis.remove(i);
                            break;
                        }
                    }
                case 3:
                    for (Imovel imoveis:listaImoveis) {
                    System.out.println(imoveis);
                }
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
