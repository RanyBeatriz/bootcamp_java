# bootcamp_java
import java.util.Scanner;

public class dia_2 {

Scanner scanner = new Scanner(System.in);
    System.out.print("Digite seu nome completo: ");
String nome_completo = scanner.nextLine();

    System.out.println("Olá, " + nome_completo + "!");

Scanner scanner1 = new Scanner(System.in);
    System.out.print("Como gostaria de ser chamado(a)? ");
String apelido = scanner1.nextLine();

    System.out.println("Seja bem-vindo, " + apelido + "!");

    System.out.print("Deseja excluir seu nome completo do sistema? (sim/não) ");
String resposta = scanner.nextLine();

    if (resposta.equalsIgnoreCase("sim")) {
nome_completo = null;
        System.out.print("Seu nome completo foi removido do sistema");
    } else {
            System.out.print("Seu nome completo continuará armazenado");
    }
            scanner.close();

}}
