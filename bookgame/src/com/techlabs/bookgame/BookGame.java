package com.techlabs.bookgame;
import java.util.Random;
import java.util.Scanner;
public class BookGame {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		System.out.println("Enter player1 name:");
		String player1=scanner.nextLine();
		System.out.println("Enter player name:");
		String player2=scanner.nextLine();
		int totalpages=scanner.nextInt();
		int player1Score = playGame(player1, random, scanner, totalpages);
        int player2Score = playGame(player2, random, scanner, totalpages);
		System.out.println(player1+"totalScore is"+player1Score);
		System.out.println(player2+"totalScore is"+player2Score);
		if (player1Score > player2Score) {
            System.out.println(player1 + " is the winner");
        } else if (player2Score > player1Score) {
            System.out.println(player2 + " is the winner");
        } else {
            System.out.println("It's a tie");
        }
        /* String player=null;
         int playerScore=0;
        playGame(player, random, scanner, playerScore);*/
		
		
	}
	public static int playGame(String player,Random random, Scanner scanner,int totalpages) {
		System.out.println(player+"Start playing");
		int totalScore=0;
		int turn=0;
		while(true) {
			turn++;
			System.out.println("Turn ->"+turn);
			int pageNumber=random.nextInt(totalpages)+1;
			System.out.println("PAge number gennerated is:"+pageNumber);
			int x=pageNumber%10;
			int score=pageNumber%x;
			totalScore+=score;
			//System.out.println("PAge number gennerated is:"+pageNumber);
			System.out.println("Score is:"+score);
			System.out.println("Total Score is:"+totalScore);
			System.out.println("COntinue playing y/n");
			String continuePlaying=scanner.nextLine();
			if(!continuePlaying.equalsIgnoreCase("y")) {
				break;
			}
			/*else {
				int x=pageNumber%10;
				int score=pageNumber%x;
				totalScore+=score;
			}*/
		}
		System.out.println(player +"Totalscore is"+totalScore);
		System.out.println();
		return totalScore;
		
	}

}
