package modelos;

public class Senha {
    private int numero;
    private TipoSenha tipo;
    private StatusSenha status;

    public Senha(int numero, TipoSenha tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = StatusSenha.AGUARDANDO;
    }

    public int getNumero() {
        return numero;
    }

    public TipoSenha getTipo() {
        return tipo;
    }

    public StatusSenha getStatus() {
        return status;
    }

    public void setStatus(StatusSenha status) {
        this.status = status;
    }


    


}
