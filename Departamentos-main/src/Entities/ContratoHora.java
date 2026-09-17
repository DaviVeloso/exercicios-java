package Entities;

import java.util.Date;

public class ContratoHora {

    private Date data;
    private Double ValorPorHora;
    private Integer Horas;

    public ContratoHora(){

    }

    public ContratoHora(Date data, Double valorPorHora, Integer horas) {
        this.data = data;
        ValorPorHora = valorPorHora;
        Horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return ValorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        ValorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return Horas;
    }

    public void setHoras(Integer horas) {
        Horas = horas;
    }

    public double ValorTotal(){
        return ValorPorHora * Horas;
    }
}
