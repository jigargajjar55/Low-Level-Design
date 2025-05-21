package LLDTicTacToeGame.Model;

public class Board {

    public int size;
    int count;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.count = 0;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {

        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == null) {

            this.count++;

            board[row][col] = playingPiece;
            return true;

        } else {
            return false;
        }

    }

    public boolean isThereAnyFreeCells() {

        // Check if there any free Cells available into board
        if (count < (size * size)) {
            return true;
        } else {
            return false;
        }
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }

    }

    /*
     * 
     * //Time: O(4 * Size)
     * //Space: O(1)
     * public boolean isThereWinner(int row, int col, PieceType pieceType) {
     * 
     * boolean isRowMatch = true;
     * boolean isColMatch = true;
     * boolean isDiagonalMatch = true;
     * boolean isAntiDiagonalMatch = true;
     * 
     * // Need to check in row
     * for (int i = 0; i < size; i++) {
     * if (board[row][i] == null || board[row][i].pieceType != pieceType) {
     * isRowMatch = false;
     * break;
     * }
     * }
     * 
     * // Need to check in column
     * for (int i = 0; i < size; i++) {
     * if (board[i][col] == null || board[i][col].pieceType != pieceType) {
     * isColMatch = false;
     * break;
     * }
     * }
     * 
     * // Need to check in Diagonal
     * for (int i = 0; i < size; i++) {
     * 
     * if (board[i][i] == null || board[i][i].pieceType != pieceType) {
     * isDiagonalMatch = false;
     * break;
     * }
     * }
     * 
     * // Need to check in Anti-Diagonal
     * for (int i = 0; i < size; i++) {
     * 
     * if (board[size - i - 1][size - i - 1] == null
     * || board[size - i - 1][size - i - 1].pieceType != pieceType) {
     * isAntiDiagonalMatch = false;
     * break;
     * }
     * }
     * 
     * return (isRowMatch || isColMatch || isDiagonalMatch || isAntiDiagonalMatch);
     * }
     * 
     * 
     */


    
}
