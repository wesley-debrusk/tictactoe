package tictactoe;

public class Board {

	String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	public void printBoard() {
		System.out.println("     |     |     ");
		System.out.println("  " + this.board[0][0] + "  |  " + this.board[0][1] + "  |  " + this.board[0][2] + "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + this.board[1][0] + "  |  " + this.board[1][1] + "  |  " + this.board[1][2] + "  ");
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  " + this.board[2][0] + "  |  " + this.board[2][1] + "  |  " + this.board[2][2] + "  ");
		System.out.println("     |     |     ");
	}

	public void printTutorial() {
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

	public boolean isMoveValid(int position) {
		switch (position) {
		case 1:
			if (this.board[0][0] == " ") {
				return true;
			} else {
				return false;
			}
		case 2:
			if (this.board[0][1] == " ") {
				return true;
			} else {
				return false;
			}
		case 3:
			if (this.board[0][2] == " ") {
				return true;
			} else {
				return false;
			}
		case 4:
			if (this.board[1][0] == " ") {
				return true;
			} else {
				return false;
			}
		case 5:
			if (this.board[1][1] == " ") {
				return true;
			} else {
				return false;
			}
		case 6:
			if (this.board[1][2] == " ") {
				return true;
			} else {
				return false;
			}
		case 7:
			if (this.board[2][0] == " ") {
				return true;
			} else {
				return false;
			}
		case 8:
			if (this.board[2][1] == " ") {
				return true;
			} else {
				return false;
			}
		case 9:
			if (this.board[2][2] == " ") {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
