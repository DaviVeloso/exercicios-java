package Aplication;

import Entities.Calculos;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serao alugados? ");
        int n = sc.nextInt();
        Calculos[] vect = new Calculos[n];


        for(int i = 0; i < n; i++){

            System.out.println("Aluguel " + "#"+ (i + 1) + ": ");
            System.out.println("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Quarto: ");
            int quarto = sc.nextInt();
            vect[i] = new Calculos(nome, email, quarto);
        }

        System.out.println("Quartos ocupados: ");

        for(int i = 0; i < n; i++){
            if(vect[i] != null){
                System.out.println(vect[i].getQuarto() + ", " + vect[i].getNome() + ", " + vect[i].getEmail());
            }
        }













    }
}
