import modelos.Senha;
import modelos.TipoSenha;

public class Main {
    public static void main(String[] args) {
        Senha senha1 = new Senha(1, TipoSenha.NORMAL);
        Senha senha2 = new Senha(2, TipoSenha.PRIORITARIA);

        System.out.println("Senha 1: " + senha1.getNumero() + ", Tipo: " + senha1.getTipo() + ", Status: " + senha1.getStatus());
        System.out.println("Senha 2: " + senha2.getNumero() + ", Tipo: " + senha2.getTipo() + ", Status: " + senha2.getStatus());



    }
}