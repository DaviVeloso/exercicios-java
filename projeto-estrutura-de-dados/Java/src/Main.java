import modelos.TipoSenha;
import util.GerenciadorSenhas;

public class Main {
    public static void main(String[] args) {
        GerenciadorSenhas gerenciador = new GerenciadorSenhas();

        gerenciador.emitir(TipoSenha.NORMAL);
        gerenciador.emitir(TipoSenha.PRIORITARIA);

        gerenciador.listarTodas();
  


       





    }
}