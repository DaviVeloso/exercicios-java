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

    public void listarTodas() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Senha: " + senhas[i].getNumero() + ", Tipo: " + senhas[i].getTipo() + ", Status: " + senhas[i].getStatus());
        }
    }

    public Senha buscarPorNumero(int numero) {
        for (int i = 0; i < quantidade; i++) {
            if (senhas[i].getNumero() == numero) {
                return senhas[i];
            }
        }
        return null;
    }

        // Lista as senhas com as prioritárias primeiro, sem mexer na ordem original do array
    public void listarOrdenadas() {
        // 1) copia as senhas para um array novo
        Senha[] copia = new Senha[quantidade];
        for (int i = 0; i < quantidade; i++) {
            copia[i] = senhas[i];
        }

        // 2) bubble sort: compara vizinhos e troca de lugar quando estão na ordem errada
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (deveVirDepois(copia[j], copia[j + 1])) {
                    Senha temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }

        // 3) imprime a cópia ordenada
        for (int i = 0; i < copia.length; i++) {
            System.out.println("Senha: " + copia[i].getNumero() + ", Tipo: " + copia[i].getTipo() + ", Status: " + copia[i].getStatus());
        }
    }

    // Devolve true se 'a' deve ficar depois de 'b' na lista ordenada
    private boolean deveVirDepois(Senha a, Senha b) {
        boolean aPrioritaria = a.getTipo() == TipoSenha.PRIORITARIA;
        boolean bPrioritaria = b.getTipo() == TipoSenha.PRIORITARIA;

        if (aPrioritaria != bPrioritaria) {
            return !aPrioritaria;   // se 'a' é normal e 'b' é prioritária, 'a' vai depois
        }
        return a.getNumero() > b.getNumero();   // mesmo tipo: ordem crescente de número
    }
        









}
