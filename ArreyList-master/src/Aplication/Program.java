package Aplication;

import Funcionarios.Calculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculos calculos;

        List<Calculos> List = new ArrayList<>();



        System.out.println("Quantos funcionarios serao registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionario " + " #" + (i + 1));
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            sc.next();
            String nome = sc.nextLine();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            calculos = new Calculos(id, nome, salario);
            List.add(calculos);
        }

        System.out.println("Entre com o id do funcionario que deseja dar um almento: ");
        int idsalary = sc.nextInt();
        Integer pos = position(List, idsalary);
        if(pos == null){
            System.out.println("este id nao existe");
        }else{
            System.out.println("Entre com a porcentagem: ");
            double porcent = sc.nextDouble();
            List.get(pos).Almento(porcent);
        }
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for(Calculos cal: List){
            System.out.println(emp.getId() + ", " + emp.getNome() + ", " + String.format("%.3f",emp.getSalario()));
        }
sc.close();
    }
    public static Integer position(List<Calculos> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
