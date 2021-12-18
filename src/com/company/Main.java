package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in); //instanciando a classe
        String estadoJogo = "INICIO";
        int[] posicoesEscolhidas = new int [9];
        Random random = new Random();
        int rand;
        System.out.println("Bem vindo ao Jogo da Velha, você deverá fazer uma sequência de 3 'X' na vertical," +
                "horizontal ou diagonal, para ganhar o jogo, segue a baixo a tabela com as possíveis posições: ");
        char[][] exemp = {
                {'1', '|','2', '|', '3'},
                {'4', '|','5', '|', '6'},
                {'7', '|','8', '|', '9'}
        };
        printTabuleiro(exemp);

        System.out.println("Faça sua escolha e comece:");

        char[][] tabuleiro = {
                {'_', '|','_', '|', '_'},
                {'_', '|','_', '|', '_'},
                {' ', '|',' ', '|', ' '}
        };
        printTabuleiro(tabuleiro);

        // Solicitando as jogadas:
        int i = 0;
        int in;
        while (i<9){

            if (i%2 == 0) { //vez do player
                System.out.printf("Digite a %d ª posição escolhida: ", i+1);
                in = scan.nextInt();

                //verificando se a posição já foi escolhida:
                if (posicoesEscolhidas[in-1]==1 || in >9 || in <=0){
                    System.out.println("Esta posição já foi escolhida anteriormente, ou não é valida, favor escolha outra!! ");
                    i--;
                }else{
                    posicoesEscolhidas[in-1] = 1;
                    atualizaTabuleiro(in,2,tabuleiro);
                }


            }else{ //vez do bot

                in= random.nextInt(8)+1;
                //verificando se a posição já foi escolhida:
                if (posicoesEscolhidas[in-1]==1 || in >9 || in <=0){
                    i--;
                }else{
                    System.out.println("Jogada do PC!! ");
                    posicoesEscolhidas[in-1] = 1;
                    atualizaTabuleiro(in,1,tabuleiro);
                }

            }

            //Verificando se há vencedor:
            for (int j=0; j<3; j++){// verificado as linhas
                if(tabuleiro[j][0] == 'X'&&  tabuleiro[j][2] == 'X'&& tabuleiro[j][4] == 'X'){
                    System.out.println("QUE PENA!! VOCÊ PERDEU O JOGO!  ");
                    i=10;
                }else  if(tabuleiro[j][0] == 'O'&&  tabuleiro[j][2] == 'O'&& tabuleiro[j][4] == 'O'){
                    System.out.println("PARABÉNS!! VOCÊ GANHOU O JOGO!  ");
                    i=10;
                }
            }

            for (int j=0; j<5; j=j+2){ // verificado as colunas
                if(tabuleiro[0][j] == 'X'&&  tabuleiro[1][j] == 'X'&& tabuleiro[2][j] == 'X'){
                    System.out.println("QUE PENA!! VOCÊ PERDEU O JOGO!  ");
                    i=10;
                }else  if(tabuleiro[0][j] == 'O'&&  tabuleiro[1][j] == 'O'&& tabuleiro[2][j] == 'O'){
                    System.out.println("PARABÉNS!! VOCÊ GANHOU O JOGO!  ");
                    i=10;
                }
            }

            //verificando diagonais:
            if((tabuleiro[0][0] == 'X' && tabuleiro[1][2] == 'X' &&tabuleiro[2][4] == 'X') || (tabuleiro[2][0] == 'X' && tabuleiro[1][2] == 'X' &&tabuleiro[0][4] == 'X') ){
                System.out.println("QUE PENA!! VOCÊ PERDEU O JOGO!  ");
                i=10;
            }else if((tabuleiro[0][0] == 'O' && tabuleiro[1][2] == 'O' &&tabuleiro[2][4] == 'O') || (tabuleiro[2][0] == 'O' && tabuleiro[1][2] == 'O' &&tabuleiro[0][4] == 'O') ){
                System.out.println("PARABÉNS!! VOCÊ GANHOU O JOGO!  ");
                i=10;
            }


            i++;
        }
    }

    public static void printTabuleiro (char[][] tabuleiro){ // método
        for (char[] row: tabuleiro){ // forEach
            for(char colun: row){
                System.out.print(colun);
            }
            System.out.println();
        }
    }

    // JOGADOR 1 = 'x' -> Bot
    // JOGADOR 2 = 'o' -> player
    public static void atualizaTabuleiro(int position, int player, char[][] tabuleiro) {
        char character;

        if(player == 1){
            character = 'X';
        }else {
            character = 'O';
        }

        switch (position){
            case 1: tabuleiro[0][0] =character;
                printTabuleiro(tabuleiro);
                break;
            case 2: tabuleiro[0][2] =character;
                printTabuleiro(tabuleiro);
                break;
            case 3: tabuleiro[0][4] =character;
                printTabuleiro(tabuleiro);
                break;
            case 4: tabuleiro[1][0] =character;
                printTabuleiro(tabuleiro);
                break;
            case 5: tabuleiro[1][2] =character;
                printTabuleiro(tabuleiro);
                break;
            case 6: tabuleiro[1][4] =character;
                printTabuleiro(tabuleiro);
                break;
            case 7: tabuleiro[2][0] =character;
                printTabuleiro(tabuleiro);
                break;
            case 8: tabuleiro[2][2] =character;
                printTabuleiro(tabuleiro);
                break;
            case 9: tabuleiro[2][4] =character;
                printTabuleiro(tabuleiro);
                break;
            default:
                break;
        }
    }





}
