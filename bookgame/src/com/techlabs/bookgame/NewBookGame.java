package com.techlabs.bookgame;
import java.util.Random;
import java.util.Scanner;
public class NewBookGame {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        System.out.print("Enter Name of player1 -> ");
		        String player1 = scanner.nextLine();

		        System.out.print("Enter Name of player2 -> ");
		        String player2 = scanner.nextLine();

		        int totalNumberOfPages = 300;
		        int player1Turns=0;
		        int player2Turns=0;
		        

		        System.out.println(player1 + " Starts playing ->");
		        int player1Score = playGame(player1, random, scanner, totalNumberOfPages);
		        System.out.println(player1 + "'s Total Score: " + player1Score);

		        System.out.println(player2 + " Starts playing ->");
		        int player2Score = playGame(player2, random, scanner, totalNumberOfPages);
		        System.out.println(player2 + "'s Total Score: " + player2Score);

		        if (player1Score > player2Score) {
		            System.out.println(player1 + " is the winner");
		        } else if (player2Score > player1Score) {
		            System.out.println(player2 + " is the winner");
		        } else {
		            if(player1Turns<player2Turns) {
		            	System.out.println(player1 +"is win");
		            }
		            else if(player1Turns>player2Turns) {
		            	System.out.println(player2+"is winner");
		            }
		            else {
		            	System.out.println("Its a tie!");
		            }
		        }

		        scanner.close();
		    }

		    private static int playGame(String player, Random random, Scanner scanner, int totalNumberOfPages) {
		        int totalScore = 0;
		        int turn = 0;
		        boolean continuePlaying = true;
		        int player1Turns=0;
		        int player2Turns=0;
				while (turn<totalNumberOfPages &&continuePlaying) {
		            turn++;
		            System.out.println("Turn  -> " + turn);
		            int pageNumber = random.nextInt(totalNumberOfPages) + 1;
		            int score = pageNumber % 7;
		            totalScore += score;
		            System.out.println("Page Number Generated -> " + pageNumber + "   (" + pageNumber + "%7 => " + score + ")");
		            System.out.println("Score : " + score);
		            System.out.println("Total Score : " + totalScore);
		            //System.out.println(player+" won in turns"+turn);
		            System.out.print("Continue playing -> y/n -> ");
		            continuePlaying = scanner.nextLine().equalsIgnoreCase("y");
		        }
				System.out.println("Total no of turns of "+player+" is "+turn);
		        return totalScore;
		    }
		
		
	        
	}

