package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playagain;
        do{
            String[] words = new String[] { "boy", "cat", "dog"};

            String randWord = words[(int) (Math.random() * words.length)];   // gets a random word from the array
            char[] letters = new char[randWord.length()];               //stores user input
            //char[] missing = new char[randWord.length()];
            ArrayList<Character> temp = new ArrayList<>();
            StringBuilder missing = new StringBuilder();
            //char alpha;
            int count = 0;

            for (int i = 0; i < letters.length; i++) {
                letters[i] = '_';
            }
        /*for (int i = 0; i < letters.length; i++) {
            missing[i] = ' ';
        }*/
            System.out.println();
            System.out.println("H  A  N  G  M  A  N");
            System.out.println();
            System.out.println("+----+");
            System.out.println();
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println();
            System.out.println("=======");

            int lives = 4;

            while (lives>0){
                System.out.println();
                System.out.println("Lives: ");
                for (int i = 0; i < lives; i++) {
                    System.out.print("O");
                }

                System.out.println();
                System.out.println("Guess a letter: ");
                String input = scanner.nextLine().toLowerCase();
                char letter = input.charAt(0);   //grabs 1st character

                while(temp.contains(letter))
                {
                    System.out.println("You have already guessed that letter. Choose again.");
                    System.out.println("Guess a letter: ");
                    input = scanner.nextLine().toLowerCase();
                    letter = input.charAt(0);   //grabs 1st character
                }
                temp.add(letter);

                boolean gameEnd = true;
                boolean correctGuess = false;


                for (int i = 0; i < randWord.length(); i++) {
                    char l = randWord.charAt(i);

                    if (letter == l) {      //check if entered letter is correct
                        letters[i] = l;
                        correctGuess = true;
                    }
                }

                if(!correctGuess){
                    lives-=1;
                    missing.append(letter);
                    //count++;
                }

                switch (lives) {
                    case 4:
                        System.out.println();
                        System.out.println("+----+");
                        System.out.println();
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println();
                        System.out.println("=======");
                        break;

                    case 3:
                        System.out.println();
                        System.out.println("+----+");
                        System.out.println("");
                        System.out.println(" O |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println();
                        System.out.println("=======");
                        break;

                    case 2:
                        System.out.println();
                        System.out.println("+----+");
                        System.out.println();
                        System.out.println("O |");
                        System.out.println("| |");
                        System.out.println("  |");
                        System.out.println();
                        System.out.println("=======");
                        break;

                    case 1:
                        System.out.println();
                        System.out.println("+----+");
                        System.out.println();
                        System.out.println(" O |");
                        System.out.println(" | |");
                        System.out.println("/  |");
                        System.out.println();
                        System.out.println("=======");
                        break;

                    default: System.out.println();
                        System.out.println("+----+");
                        System.out.println();
                        System.out.println(" O |");
                        System.out.println(" | |");
                        System.out.println("/ ||");
                        System.out.println();
                        System.out.println("=======");
                        break;
                }
                System.out.println("Missed letters: " + missing );


                //for (int i = 0; i < missing.length; i++) {

                //System.out.println(missing);

                System.out.println();
                System.out.println("Word: ");
                for (int i = 0; i < letters.length; i++) {
                    if ( letters[i] == '_')
                        gameEnd = false;
                    System.out.print(letters[i]);
                }

                if(gameEnd){
                    System.out.println();
                    System.out.println("Yes! The secret word is \""+ randWord + "\"! You have won!");
                    break;
                }
                if(lives == 0){
                    System.out.println();
                    System.out.println("Sorry you have lost!");
                }
            }

            System.out.println();
            System.out.println("Do you want to play again? (yes or no)");
            playagain = scanner.nextLine().toLowerCase();

        }while(playagain.equals("yes"));
    }

}


/*
if (letter != l){

        missing[i]= letter;
        break;

        }


            O
           |
           / \

*/
