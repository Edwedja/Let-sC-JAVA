package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        // AULA 4 -  DE CONTROLE DE FLUXOS (IF, ELSE, ETC...)
        /*
         * pessoas < 16 -> não podem votar
         * pessoas >= 16 -> opcional && < 18
         * pessoas > 18 -> obrigatório
         * pessoas < 70 -> obrigatório
         * pessoas > 70 -> opcional*/

        System.out.print("Informe a sua idade: ");
        //int ag = Integer.parseInt(scan.nextLine());
        int ag = scan.nextInt();

        if(ag >= 16 &&  ag < 18 || ag > 70){
            System.out.println("Seu voto é opcional");
        } else if (ag < 16){
            System.out.println("Você não pode votar");
        }else {
            System.out.println("Seu voto é obrigatório");
        }

        int month = 1;
        String monthString;

        switch (month) {
            case 1:
                monthString = "Janeiro";
                break;
            case 2:
                monthString = "Fevereiro";
                break;
            case 3:
                monthString = "Março";
                break;
            default:
                monthString = "teste";
        }

        System.out.println(monthString);

        int mes;
        int dias = 31;

        System.out.println("Digite o mês [1-12]: ");
        mes = scan.nextInt();

        if (mes > 12 || mes < 1) {
            System.out.println("Mês inválido");
        }

        switch (mes){
            case 2:
                dias = dias -3;
                break;
            case 4 :
            case 6:
            case 9:
            case 11:
                dias = dias -1;
                break;

        }
        System.out.printf("O mês %d possui %d dias", mes, dias);


        // Estruturas de repetição!  While/Do-while/ for

        int count = 0;
//        while (count < 11){
//            System.out.println("Count is: " + count);
//            count +=1;
//        }

        do{
            System.out.println("Count is: " + count);
            count +=1;
        } while (count < 11);

        // MÉDIA DE NOTAS

        float notas = 0f;
        float total = 0f;
        float media = 0f;
        int cont = 0;

        while (cont<3){
            cont +=1;
            System.out.printf("Informe a %d nota", cont);
            notas = scan.nextFloat();
            total += notas;
        }
        media = total /3;
        System.out.printf(" A média é %f", media);


        for (int i =0; i< 11; i++){
            System.out.println(i);
        }


    }
}
