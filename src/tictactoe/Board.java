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

	// translate coordinate to a move on the board
	public int getMoveNum(int i, int j) {
		if (i == 0 && j == 0) {
			return 1;
		} else if (i == 0 && j == 1) {
			return 2;
		} else if (i == 0 && j == 2) {
			return 3;
		} else if (i == 1 && j == 0) {
			return 4;
		} else if (i == 1 && j == 1) {
			return 5;
		} else if (i == 1 && j == 2) {
			return 6;
		} else if (i == 2 && j == 0) {
			return 7;
		} else if (i == 2 && j == 1) {
			return 8;
		} else if (i == 2 && j == 2) {
			return 9;
		} else {
			return 0;
		}
	}

	// update board position
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

	// return true if board position is empty
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

	// returns the best possible move for the current state of the board
	public int findBestMove() {
		int bestVal = -1000;
		int bestMove = -1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (this.board[i][j] == " ") {

					this.board[i][j] = "O";
					int moveVal = minimax(0, false);
					board[i][j] = " ";

					if (moveVal > bestVal) {
						bestVal = moveVal;
						bestMove = getMoveNum(i, j);
					}

				}

			}
		}
		return bestMove;
	}

	// return +10 if player 2 wins, -10 if player 1 wins, 0 if nobody wins
	public int evaluate() {
		// check rows
		for (int row = 0; row < 3; row++) {
			if (this.board[row][0] == this.board[row][1] && this.board[row][1] == this.board[row][2]) {
				if (this.board[row][0] == "O")
					return +10;
				else if (this.board[row][0] == "X")
					return -10;
			}
		}

		// check columns
		for (int col = 0; col < 3; col++) {
			if (this.board[0][col] == this.board[1][col] && this.board[1][col] == this.board[2][col]) {
				if (this.board[0][col] == "O")
					return +10;

				else if (this.board[0][col] == "X")
					return -10;
			}
		}

		// check diagonals
		if (this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]) {
			if (this.board[0][0] == "O")
				return +10;
			else if (this.board[0][0] == "X")
				return -10;
		}
		if (this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0]) {
			if (this.board[0][2] == "O")
				return +10;
			else if (this.board[0][2] == "X")
				return -10;
		}	
		
		return 0;
	}

	public int minimax(int depth, Boolean playerTwoMove) {
		int score = evaluate();
 
		// if player 2 wins return +10
		if (score == 10) {
			return score;
		}
		
		// if player 1 wins return -10
		if (score == -10) {
			return score;
		}

		// if there are no moves left then it's a tie
		if (isMovesLeft() == false) {
			return 0;
		}

		// if player 2 move
		if (playerTwoMove) {
			int best = -1000;
			
			// check each cell and use recursion if cell is empty
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
	
					if (board[i][j] == " ") {
						
						board[i][j] = "O";
						best = Math.max(best, minimax(depth + 1, !playerTwoMove));
						board[i][j] = " ";
					}
				}
			}
			return best;
		}

		// if player 1 move
		else {
			int best = 1000;
			
			// check each cell and use recursion if empty
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					
					if (board[i][j] == " ") {
						
						board[i][j] = "X";
						best = Math.min(best, minimax(depth + 1, !playerTwoMove));
						board[i][j] = " ";
					}
				}
			}
			return best;
		}
	}
 
	// check if there are any moves left
	public Boolean isMovesLeft() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (board[i][j] == " ") {
					return true;
				}
		return false;
	}

}
