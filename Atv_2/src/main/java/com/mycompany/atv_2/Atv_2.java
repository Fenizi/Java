/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv_2 {
        public static void main(String[] args) {


Scanner ler = new Scanner(System.in);
        
        int idade;
        int parametro = 21;
        
        System.out.println("Insira a sua idade: ");
        idade = ler.nextInt();
        
        if (idade > parametro) 
        {
            System.out.println("Você tem mais de 21 anos.");
        }
        else 
        {
            System.out.println("Você tem menos de 21 anos.");
        }
}
}