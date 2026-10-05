package util;
import modelos.Senha;
import modelos.TipoSenha;

public class GerenciadorSenhas {
    private Senha[] senhas = new Senha[100];
    private int quantidade = 0;
    private int proximoNumero = 1;


    public Senha emitir(TipoSenha tipo) {
        if (quantidade == senhas.length){
            return null;
        }
        senhas[quantidade] = new Senha(proximoNumero, tipo);
        quantidade++;
        proximoNumero++;
        return senhas[quantidade - 1];
      }

      public void listarTodas(){
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Senha: " + senhas[i].getNumero() + ", Tipo: " + senhas[i].getTipo() + ", Status: " + senhas[i].getStatus());
        }

      }
        









}
