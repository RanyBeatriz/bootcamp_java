import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Cliente> clientes = new ArrayList<>();

    public void iniciar() {

        int opcao;

        do {

            System.out.println("\n===== CLIENTES =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarCliente();
                    break;

                case 2:
                    listarClientes();
                    break;

            }

        } while (opcao != 0);

    }

    public void cadastrarCliente() {

        Cliente cliente = new Cliente();

        System.out.print("Nome: ");
        cliente.nome = scanner.nextLine();

        System.out.print("Telefone: ");
        cliente.telefone = scanner.nextLine();

        clientes.add(cliente);

        System.out.println("Cliente cadastrado!");

    }

    public void listarClientes() {

        for (int i = 0; i < clientes.size(); i++) {

            Cliente c = clientes.get(i);

            System.out.println(
                    i + " - " + c.nome +
                            " | Telefone: " + c.telefone
            );

        }

    }

}
