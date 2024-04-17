package com.chainsys.day4;

import java.util.Scanner;

public class HighScoreCalculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score1;
		while(true) {
			System.out.println("Enter the player 1 score:");
			score1 = scanner.nextInt();
			if(score1>0) {
				break;
			}
		}
		int score2 ;
		while(true) {
			System.out.println("Enter the player 2 score:");
			score2 = scanner.nextInt();
			if(score2>0) {
				break;
			}
		}
		int score3;
		while(true) {
			System.out.println("Enter the player 3 score:");
			score3 = scanner.nextInt();
			if(score3>0) {
				break;
			}
		}
		int score4;
		while(true) {
			System.out.println("Enter he player 4 score");
			score4 = scanner.nextInt();
			if(score4>0) {
				break;
			}
		}

		displayHighScorePosition("player 1", score1);
		displayHighScorePosition("player 2", score2);
		displayHighScorePosition("player 3", score3);
		displayHighScorePosition("player 4", score4);
	}

	public static void displayHighScorePosition(String playerName, int playerScore) {
		int position = calculateHighScorePosition(playerScore);
		System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}
}
