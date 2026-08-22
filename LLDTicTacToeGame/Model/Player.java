package LLDTicTacToeGame.Model;

public class Player {

    public String name;
    public PlayingPiece playingPiece;
    int sizeOfBoard;
    int[] rowCheck;
    int[] colCheck;
    int[] diagonalCheck;
    int[] antiDiagonalCheck;
    
    public Player(String name, PlayingPiece playingPiece, int sizeOfBoard){
        this.name = name;
        this.playingPiece = playingPiece;

        this.sizeOfBoard = sizeOfBoard;
        this.rowCheck = new int[sizeOfBoard];
        this.colCheck = new int[sizeOfBoard];
        this.diagonalCheck = new int[sizeOfBoard];
        this.antiDiagonalCheck = new int[sizeOfBoard];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    //Time: O(1)
    //Space: O(N)
    public boolean isWinner(int row, int col) {

        rowCheck[row] += 1;
        colCheck[col] += 1;
        if (row == col) {
            diagonalCheck[row] += 1;
        }

        if ((row + col) == sizeOfBoard-1) {
            antiDiagonalCheck[row] += 1;
        }

        if (rowCheck[row] == sizeOfBoard ||
                colCheck[col] == sizeOfBoard ||
                diagonalCheck[row] == sizeOfBoard ||
                antiDiagonalCheck[row] == sizeOfBoard) {
            return true;
        }

        return false;

    }


    
    
}
