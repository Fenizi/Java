/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv_8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String meuNome = "Pedro";
        int minhaIdade = 19;
        double meuPeso = 70.0;
        double minhaAltura = 1.70;
        String minhaSerieFavorita = "La Casa de Papel";
        String minhaMusicaFavorita = "Confessionario";
        String meuJogoFavorito = "Call of Duty";

        
        
        System.out.print("Nome: ");
        String nomePessoa = ler.nextLine();

        System.out.print("Idade: ");
        int idadePessoa = ler.nextInt();

        System.out.print("Peso: ");
        double pesoPessoa = ler.nextDouble();

        System.out.print("Altura: ");
        double alturaPessoa = ler.nextDouble();
        ler.nextLine(); 

        System.out.print("Série favorita: ");
        String seriePessoa = ler.nextLine();

        System.out.print("Música favorita: ");
        String musicaPessoa = ler.nextLine();

        System.out.print("Jogo favorito: ");
        String jogoPessoa = ler.nextLine();
        
        int iguais = 0;

        if (nomePessoa.equalsIgnoreCase(meuNome)) iguais++;
        if (idadePessoa == minhaIdade) iguais++;
        if (pesoPessoa == meuPeso) iguais++;
        if (alturaPessoa == minhaAltura) iguais++;
        if (seriePessoa.equalsIgnoreCase(minhaSerieFavorita)) iguais++;
        if (musicaPessoa.equalsIgnoreCase(minhaMusicaFavorita)) iguais++;
        if (jogoPessoa.equalsIgnoreCase(meuJogoFavorito)) iguais++;

        
        if (iguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa não é tão parecida comigo.");
        }
    }
}
  
