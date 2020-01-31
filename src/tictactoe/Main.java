package tictactoe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		while (true) {
			int mode, keepPlaying;
			
			Board board = new Board();

			System.out.println("Welcome to tic-tac-toe! Board positions are as follows: ");
			board.printTutorial();
			System.out.print("Enter 1 to play singleplay or 2 to play multiplayer: ");
			mode = kbd.nextInt();

			switch (mode) {
			case 1:
				runSinglePlayer(board, kbd);
				break;
			case 2:
				runMultiplayer(board, kbd);
				break;

			}
			
			System.out.print("Enter 1 to play again, or anything else to quit: ");
			keepPlaying = kbd.nextInt();
			if (keepPlaying == 1) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("Thanks for playing!");
		kbd.close();

	}

	public static void clearScreen() {
		System.out.println("\033\143");
	}

	public static boolean continueGame(Board board) {
		if (board.evaluate() == 0 && board.isMovesLeft() == true) {
			return true;
		} else if (board.evaluate() == 10) {
			System.out.println("Player 2 wins");
			return false;
		} else if (board.evaluate() == -10) {
			System.out.println("Player 1 wins");
			return false;
		} else {
			System.out.println("Tie");
			return false;
		}
	}

	public static void runSinglePlayer(Board board, Scanner kbd) {

		int move;

		board.printBoard();

		while (true) {

			if (continueGame(board)) {
				System.out.print("Enter your move: ");
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
			} else {
				return;
			}

			if (continueGame(board)) {
				move = board.findBestMove();
				board.makeMove(move, 2);
				board.printBoard();
			} else {
				return;
			}
		}

	}

	public static void runMultiplayer(Board board, Scanner kbd) {
		int move;
		board.printBoard();

		while (true) {

			if (continueGame(board)) {
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
			} else {
				return;
			}
			if (continueGame(board)) {
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
			} else {
				return;
			}
		}

	}

}
