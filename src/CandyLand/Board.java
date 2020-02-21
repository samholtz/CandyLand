package CandyLand;		// apologies on the awful naming scheme, I started over about 3 times
								// because I needed a clean start

public class Board {
	private static int width;
	private static int length;

	public static String[] board;

	public Board() {
		board = new String[62];		// creates an Array of String values for visual location,
		width = 10;					// I dropped everything down to 60 for testing and then manually entered,
		length = 6;					// all array values because I was having trouble using loops to fill them.
	}

	public void makeSpaces() {

		board[0] = "Start"; // Sets space 0 as the start space

		board[1] = "R"; // Sets the first 6 spaces to the correct color order
		board[2] = "P";
		board[3] = "Y";
		board[4] = "B";
		board[5] = "O";
		board[6] = "G";

		board[7] = "R";
		board[8] = "P";
		board[9] = "Y";
		board[10] = "B";
		board[11] = "O";
		board[12] = "G";

		board[13] = "R";
		board[14] = "P";
		board[15] = "Y";
		board[16] = "B";
		board[17] = "O";
		board[18] = "G";

		board[19] = "R";
		board[20] = "P";
		board[21] = "Y";
		board[22] = "B";
		board[23] = "O";
		board[24] = "G";

		board[25] = "R";
		board[26] = "P";
		board[27] = "Y";
		board[28] = "B";
		board[29] = "O";
		board[30] = "G";

		board[31] = "R";
		board[32] = "P";
		board[33] = "Y";
		board[34] = "B";
		board[35] = "O";
		board[36] = "G";

		board[37] = "R";
		board[38] = "P";
		board[39] = "Y";
		board[40] = "B";
		board[41] = "O";
		board[42] = "G"; // would continue all the way to 134... or whatever value...

		board[43] = "R";
		board[44] = "P";
		board[45] = "Y";
		board[46] = "B";
		board[47] = "O";
		board[48] = "G";

		board[49] = "R";
		board[50] = "P";
		board[51] = "Y";
		board[52] = "B";
		board[53] = "O";
		board[54] = "G";

		board[55] = "R";
		board[56] = "P";
		board[57] = "Y";
		board[58] = "B";
		board[59] = "O";
		board[60] = "G";

		board[61] = "End";

	}

	public static String getSpaces(int i) { // Returns the value of any given board space
		if (i > 61) { 					// If the board space is over 61 (133), it will return the winning value
			return board[62];
		}
		return board[i];
	}

	public static void makeBoard() {
		System.out.println(board[0]);		// Prints "start" array value

//		for (int i = 1; i < 62; i++) {					// this code is a big unnecessary mess
//			System.out.print(Board.board[i]);			// but I was afraid to straight up delete it
//		}

//		for (int k=1; k < board.length-1; k++) {
//			
//			System.out.print(board[k]);
//			for (int i = 1; i < length+1 ; i++) {
//				System.out.print("  ");
//				
//				System.out.print("|");
//				
//				
//				
//				for (int j=0; j<width; j++) {
//					//System.out.print(k);
//					
//					System.out.print("_" + "_");
//					System.out.print("|");
//				}
//				
//				System.out.print("\n");
//			}
//		}

		for (int k = 1; k < board.length; k++) {		// loops for printing out a formatted board, purely visual
			for (int i = 1; i < width + 1; i++) {
				for (int j = 1; j < length + 1; j++) {
					System.out.print("|__");
					if (k < 10)
						System.out.printf("0%d", k); // tests for k<10 to determine if leading 0 necessary
					else 							// for formatting of the board
						System.out.print(k);
					System.out.print(board[j]);
					k++;
				}
				System.out.print("|");
				System.out.print("\n");
			}
		}

		System.out.print("\t" + "\t" + "\t" + "\t");
		System.out.println(board[61]);		// Prints "end" array value
	}

}
