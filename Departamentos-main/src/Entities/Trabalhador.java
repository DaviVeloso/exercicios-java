package Entities;

import Entities_Enums.NivelDeTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String Name;
    private NivelDeTrabalho Level;
    private Double BaseDeSalario;

    private Departamentos departamentos;
    private List<ContratoHora> Contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String name, Double baseDeSalario, NivelDeTrabalho level, Departamentos departamentos) {
        Name = name;
        BaseDeSalario = baseDeSalario;
        Level = level;
        this.departamentos = departamentos;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public NivelDeTrabalho getLevel() {
        return Level;
    }

    public void setLevel(NivelDeTrabalho level) {
        Level = level;
    }

    public Double getBaseDeSalario() {
        return BaseDeSalario;
    }

    public void setBaseDeSalario(Double baseDeSalario) {
        BaseDeSalario = baseDeSalario;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public List<ContratoHora> getContratos() {
        return Contratos;
    }

    public void AddContract(ContratoHora Contrato) {
        Contratos.add(Contrato);
    }

    public void RemovContract(ContratoHora Contrato) {
        Contratos.remove(Contrato);
    }

    public double income(int year, int month) {
        double soma = BaseDeSalario;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora c : Contratos) {
            cal.setTime(c.getData());
            int c_year = cal.get(Calendar.YEAR);
            int c_moth = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_moth) {
                soma += c.ValorTotal();
            }
        }
        return soma;
    }
}