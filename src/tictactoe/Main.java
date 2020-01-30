package tictactoe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int mode;
		Scanner kbd = new Scanner(System.in);
		Board board = new Board();

		System.out.println("Welcome to tic-tac-toe! Board positions are as follows: ");
		board.printTutorial();
		System.out.print("Enter 1 to play singleplay or 2 to play multiplayer: ");
		mode = kbd.nextInt();

		switch (mode) {
		case 1:
			runSinglePlayer(board, kbd);
		case 2:
			runMultiplayer(board, kbd);

		}

		kbd.close();

	}

	public static void runSinglePlayer(Board board, Scanner kbd) {

		int move;

		board.printBoard();

		while (true) {

			System.out.print("Enter your move: ");
			move = kbd.nextInt();
			board.makeMove(move, 1);
			board.printBoard();
		}

	}

	public static void runMultiplayer(Board board, Scanner kbd) {
		int move;
		board.printBoard();

		while (true) {
			System.out.print("Player 1 enter your move: ");
			move = kbd.nextInt();
			if (board.isMoveValid(move)) {
				board.makeMove(move, 1);
			} else {
				while (true) {
					System.out.print("Move not valid, enter another move: ");
					move = kbd.nextInt();
					if (board.isMoveValid(move)) {
						board.makeMove(move, 1);
						break;
					}
				}
			}

			board.printBoard();

			System.out.print("Player 2 enter your move: ");
			move = kbd.nextInt();
			if (board.isMoveValid(move)) {
				board.makeMove(move, 2);
			} else {
				while (true) {
					System.out.print("Move not valid, enter another move: ");
					move = kbd.nextInt();
					if (board.isMoveValid(move)) {
						board.makeMove(move, 2);
						break;
					}
				}
			}
			board.printBoard();

		}

	}

}
