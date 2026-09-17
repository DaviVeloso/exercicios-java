package Funcionarios;

public class Calculos {
private Integer id;
private String nome;
private Double salario;

    public Calculos(Integer id, String nome,Double salario ) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void Almento (Double porcentagem){
        this.salario += salario * porcentagem;
    }

    public String ToString(){
        return id + ", " + nome + ", " + String.format("%.2f",salario);
    }
}
