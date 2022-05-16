package com.nology;

import java.util.Scanner;

public class RPS {

//    fields: char choice; String winner; (int score;)
//    methods: play(); (determineWinner()); (incrementScore():)
//    player inputs choice of rock paper or scissors
//    computer randomly generates choice of rock paper or scissors
//    based on choice, if/else to determine if player/computer wins/loses/draws
//    output result to player
//    (increment score)

        private String choice;
        private String computerChoice;
        private String winner;
        private int score;

        public RPS() {
            GetPlayerChoice();
            GenerateComputerChoice();
            PlayGame();
        }

        public void GenerateComputerChoice() {
            int randomNumber = (int) (Math.random()*3);
            switch (randomNumber){
                case(0): computerChoice = "r";
                    break;
                case(1): computerChoice = "p";
                    break;
                case(2): computerChoice = "s";
                    break;
                default:
                    System.out.println("Sorry, that's not an option!");
            }
            System.out.println("The computer chose: " + computerChoice);
        }
//    Q) could I use return type int for this method and then return computerChoice? What's the difference?

        public void GetPlayerChoice() {
            Scanner game = new Scanner(System.in);
            System.out.println("Please enter 'r' for 'Rock', 'p' for 'Paper' or 's' for 'Scissors.'");
            this.choice = game.next().toLowerCase();
            System.out.println(choice);
        }
//    Q) correct way to write a function?

        public void PlayGame() {
            if (choice.equals(computerChoice)) {
                this.winner = "It's a Draw!";
                System.out.println(winner);
            } else if (choice.equals("r") && computerChoice.equals("s") ||
                    choice.equals("s") && computerChoice.equals("p") ||
                    choice.equals("p") && computerChoice.equals("r")) {
                this.winner = "You win!";
                System.out.println(winner);
            } else {
                this.winner = "The Computer Wins!";
                System.out.println(winner);
            }

        }

    }

