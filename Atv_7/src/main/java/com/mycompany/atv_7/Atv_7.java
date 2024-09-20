/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv_7 {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double salario;
        
        System.out.print("Digite o seu salário: ");
        salario = ler.nextDouble();
        
        if (salario > 6600.0)
        {
            System.out.println("O salário é maior que 5 vezes o salário mínimo.");
        } else
        {
            System.out.println("O salário não é maior que 5 vezes o salário mínimo.");
        }
    }
}

