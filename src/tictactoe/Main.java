package tictactoe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int mode;
		String[][] tutorial = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		Scanner kbd = new Scanner(System.in);

		System.out.println("Welcome to tic-tac-toe! Board positions are as follows: ");
		printTutorial();
		System.out.print("Enter 1 to play singleplay or 2 to play multiplayer: ");
		mode = kbd.nextInt();

		switch (mode) {
		case 1:
			runSinglePlayer(kbd);
		case 2:

		}

	}

	public static void runSinglePlayer(Scanner kbd) {

		Board board = new Board();
		board.printBoard();

		while (true) {

			System.out.print("Enter your move: ");
			int move = kbd.nextInt();
			board.makeMove(move, 1);
			board.printBoard();
		}

	}

	public static void printTutorial() {
		System.out.println("     |     |     ");
		System.out.println("  1  |  2  |  3  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  4  |  5  |  6  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  7  |  8  |  9  ");
		System.out.println("     |     |     ");
	}

	

}
