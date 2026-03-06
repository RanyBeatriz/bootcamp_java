import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== CLIENTES =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Atualizar cliente");
            System.out.println("4 - Remover cliente");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();

                    nomes.add(nome);
                    telefones.add(telefone);

                    System.out.println("Cliente cadastrado!");

                    break;

                case 2:

                    System.out.println("\nLista de clientes:");

                    for (int i = 0; i < nomes.size(); i++) {

                        System.out.println(
                                i + " - " + nomes.get(i) +
                                        " | Telefone: " + telefones.get(i)
                        );

                    }

                    break;

                case 3:

                    System.out.print("Digite o ID do cliente: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    if (idAtualizar < nomes.size()) {

                        System.out.print("Novo nome: ");
                        nomes.set(idAtualizar, scanner.nextLine());

                        System.out.print("Novo telefone: ");
                        telefones.set(idAtualizar, scanner.nextLine());

                        System.out.println("Cliente atualizado!");

                    } else {

                        System.out.println("Cliente não encontrado.");

                    }

                    break;

                case 4:

                    System.out.print("Digite o ID do cliente: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();

                    if (idRemover < nomes.size()) {

                        nomes.remove(idRemover);
                        telefones.remove(idRemover);

                        System.out.println("Cliente removido.");

                    } else {

                        System.out.println("Cliente não encontrado.");

                    }

                    break;

            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");

    }

}