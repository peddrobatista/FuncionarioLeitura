package com.peddrobatista.view;

import com.peddrobatista.classes.Funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.name = teclado.nextLine();
        System.out.print("Salário Bruto: ");
        func.grossSalary = teclado.nextDouble();
        System.out.print("Tax: ");
        func.tax = teclado.nextDouble();
        System.out.println();

        System.out.println("Funcionário: " + func);
        System.out.println();

        System.out.print("Qual o percentual para aumentar o salário? ");
        double per = teclado.nextDouble();
        func.increaseSalary(per);
        System.out.println();

        System.out.println("Dados atualizados: " + func);
        teclado.close();
    }
}
