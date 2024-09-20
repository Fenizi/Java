/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int altura;
        int parametro = 175;
        
        System.out.println("Insira a sua altura: ");
        altura = ler.nextInt();
        
        if (altura > parametro) 
        {
            System.out.println("Voce tem mais do que 1,75 metros de altura!");
        }
        else
        {
            System.out.println("Você têm menos do que 1,75 metros.");
        }
    }
 }

