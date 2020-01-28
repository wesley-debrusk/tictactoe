package tictactoe;

public class Board {

	String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	public void printBoard() {
		System.out.println("     |     |     ");
		System.out.println("  " + getValue(this.board[0][0]) + "  |  " + getValue(this.board[0][1]) + "  |  "
				+ getValue(this.board[0][2]) + "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + getValue(this.board[1][0]) + "  |  " + getValue(this.board[1][1]) + "  |  "
				+ getValue(this.board[1][2]) + "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + getValue(this.board[2][0]) + "  |  " + getValue(this.board[2][1]) + "  |  "
				+ getValue(this.board[2][2]) + "  ");
		System.out.println("     |     |     ");
	}

	public static String getValue(String value) {
		return (value == null ? " " : value);
	}

	public void makeMove(int position, int playerNum) {
		switch (position) {
		case 1:
			if (playerNum == 1) {
				this.board[0][0] = "X";
			} else if (playerNum == 2) {
				this.board[0][0] = "O";
			}
			break;
		case 2:
			if (playerNum == 1) {
				this.board[0][1] = "X";
			} else if (playerNum == 2) {
				this.board[0][1] = "O";
			}
			break;
		case 3:
			if (playerNum == 1) {
				this.board[0][2] = "X";
			} else if (playerNum == 2) {
				this.board[0][2] = "O";
			}
			break;
		case 4:
			if (playerNum == 1) {
				this.board[1][0] = "X";
			} else if (playerNum == 2) {
				this.board[1][0] = "O";
			}
			break;
		case 5:
			if (playerNum == 1) {
				this.board[1][1] = "X";
			} else if (playerNum == 2) {
				this.board[1][1] = "O";
			}
			break;
		case 6:
			if (playerNum == 1) {
				this.board[1][2] = "X";
			} else if (playerNum == 2) {
				this.board[1][2] = "O";
			}
			break;
		case 7:
			if (playerNum == 1) {
				this.board[2][0] = "X";
			} else if (playerNum == 2) {
				this.board[2][0] = "O";
			}
			break;
		case 8:
			if (playerNum == 1) {
				this.board[2][1] = "X";
			} else if (playerNum == 2) {
				this.board[2][1] = "O";
			}
			break;
		case 9:
			if (playerNum == 1) {
				this.board[2][2] = "X";
			} else if (playerNum == 2) {
				this.board[2][2] = "O";
			}
			break;
		}

	}

}
