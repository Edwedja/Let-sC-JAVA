package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //SAÍDAS

        int idade = 27;
        String nome = "edwedja";
        float altura = 1.68f;
        // enum
        // boolean é %b

        boolean par = 4% 2 == 0;
        System.out.printf("Oi, meu nome é %s, tenho %d e minha altura é  %.2f %n", nome, idade,altura);


        // ENTRADAS
        //  System.out.printf("Hello, %s", args[0]);

        Scanner scan = new Scanner (System.in); //instanciando a classe
        //int num = Integer.parseInt((scan.nextLine())); // para que ele não pule linhas no retorno!

        System.out.println("Informe seu nome:");
        String name = scan.next();  // ou nextLine -> para o nome completo

        System.out.println("Informe a sua idade: ");
        int age = scan.nextInt();

        System.out.println("Informe um valor para o byte: ");
        byte b = scan.nextByte();

        // char c = scan.ne

        System.out.printf("o nome informado foi: %s %n", name);
        System.out.printf("a indade informada foi: %d %n", age);
        System.out.printf("a indade informada foi: %b %n", b);


        //EXERCÍCIO:

        /* Crie um programa que receba um valor em real no input e converta para dólar e euro e imprima
         * ex. você possui 5 (USD)  --> 5,65 dolar
         * ex. você possui 1 (EUR)  --> 6,39 euro */

        final float dolar = 5.65f;
        final float euro = 6.39f;

        float convD;
        float conve;

        System.out.println("Informe o valor em reais (apenas numeros) : ");
        float real = scan.nextFloat();

        convD = real / dolar;
        conve = real / euro;

        System.out.printf("A conversão para dólar é de %f (USD) %n", convD);
        System.out.printf("A conversão para euro é de %f (EUR)  %n", conve);

    }
}
