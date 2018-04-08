package com.biniyam.section4.primitiveValue;

public class CodeBlockMainApp {

	public static void main(String[] args) {
		boolean gameOver = false;
		int score = 800;
		int lavelOfCompleted = 5;
		int bonus = 100;
		int calclatedResult;

		/*
		 * calclatedResult = calculateScore(gameOver, score, lavelOfCompleted,
		 * bonus); displayResult(calclatedResult); score = 1000;
		 * lavelOfCompleted = 8; bonus = 200; calclatedResult =
		 * calculateScore(gameOver, score, lavelOfCompleted, bonus);
		 * displayResult(calclatedResult);
		 */
		int postion = calculateHighScorePostion(650);
		displayHighScorePostion("Biniyam", postion);
	}

	

	private static void displayHighScorePostion(String playerName, int postion) {
		System.out.println(playerName + " managed to get in to postion " + postion + " on the high score table");
	}

	private static int calculateHighScorePostion(int playerScore) {
		int score;
		if (playerScore >= 1000) {
			score = 1;
		} else if (playerScore < 1000 && playerScore >= 500) {
			score = 2;
		} else if (playerScore < 500 && playerScore >= 100) {
			score = 3;
		} else {
			score = 4;
		}
		return score;
	}

	private static void displayResult(int result) {
		if (result != -1) {
			System.out.println("The final calculated result is  " + result);
		} else {
			System.out.println("no calculation");
		}

	}

	private static int calculateScore(boolean gameOver, int score, int lavelOfCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (lavelOfCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		}
		return -1;
	}

}
