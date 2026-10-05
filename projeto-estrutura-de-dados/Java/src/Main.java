import java.util.Scanner;
import modelos.Senha;
import modelos.TipoSenha;
import util.GerenciadorSenhas;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorSenhas gerenciador = new GerenciadorSenhas();
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE SENHAS ===");
            System.out.println("1 - Emitir senha");
            System.out.println("2 - Listar todas as senhas");
            System.out.println("3 - Buscar senha por número");
            System.out.println("4 - Listar ordenadas (prioritárias primeiro)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Tipo (1 = Normal, 2 = Prioritária): ");
                    int t = sc.nextInt();
                    TipoSenha tipo;
                    if (t == 2) {
                        tipo = TipoSenha.PRIORITARIA;
                    } else {
                        tipo = TipoSenha.NORMAL;
                    }

                    Senha nova = gerenciador.emitir(tipo);
                    if (nova != null) {
                        System.out.println("Senha emitida: " + nova.getNumero() + " (" + nova.getTipo() + ")");
                    } else {
                        System.out.println("Não foi possível emitir: limite de senhas atingido.");
                    }
                    break;
                }
                case 2: {
                    gerenciador.listarTodas();
                    break;
                }
                case 3: {
                    System.out.print("Número da senha: ");
                    int numero = sc.nextInt();

                    Senha encontrada = gerenciador.buscarPorNumero(numero);
                    if (encontrada != null) {
                        System.out.println("Senha encontrada: " + encontrada.getNumero() + ", Tipo: " + encontrada.getTipo() + ", Status: " + encontrada.getStatus());
                    } else {
                        System.out.println("Senha não encontrada.");
                    }
                    break;
                }
                case 4: {
                    gerenciador.listarOrdenadas();
                    break;
                }
                case 0: {
                    System.out.println("Encerrando...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}