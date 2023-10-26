package LLDInterviewQuestions.TicTacToeGame.Model;


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

    public boolean isThereAnyFreeCells(){

        //Check if there any free Cells available into board
        if(count < (size * size)){
            return true;
        }else{
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

}
