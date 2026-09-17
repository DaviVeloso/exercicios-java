package Aplication;

import Entities.ContratoHora;
import Entities.Departamentos;
import Entities.Trabalhador;
import Entities_Enums.NivelDeTrabalho;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String Departamento_Nome = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Nome: ");
        String Nome = sc.nextLine();
        System.out.print("Nivel: ");
        String nivel = sc.nextLine();
        System.out.print("Salario Base: ");
        double SalarioBase = sc.nextDouble();

        Trabalhador worker = new Trabalhador(Nome, SalarioBase,NivelDeTrabalho.valueOf(nivel), new Departamentos(Departamento_Nome) );

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();
        for (int i = 1 ; i<=n ; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY):");
            Date DataContratual = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double ValorHora = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int DuraçãoHora = sc.nextInt();
            ContratoHora contrato = new ContratoHora(DataContratual, ValorHora, DuraçãoHora);
            worker.AddContract(contrato);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String MesAno = sc.next();
        int Mes = Integer.parseInt(MesAno.substring(0,2));
        int Ano = Integer.parseInt(MesAno.substring(3));

        System.out.println("Name " + worker.getName());
        System.out.println("Departamento" + worker.getDepartamentos().getNome());
        System.out.println("Income for : " + MesAno + ": " + String.format("%.2f", worker.income(Ano,Mes)));
























        sc.close();
    }
}