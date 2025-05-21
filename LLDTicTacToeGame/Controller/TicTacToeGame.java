package LLDTicTacToeGame.Controller;

import java.util.*;

import LLDTicTacToeGame.Model.Board;
import LLDTicTacToeGame.Model.PieceType;
import LLDTicTacToeGame.Model.Player;
import LLDTicTacToeGame.Model.PlayingPiece;
import LLDTicTacToeGame.Model.PlayingPieceO;
import LLDTicTacToeGame.Model.PlayingPieceX;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame(int noOfPlayers, int sizeOfBoard) {
        initializeGame(noOfPlayers, sizeOfBoard);
    }

    public void initializeGame(int noOfPlayers, int sizeOfBoard) {

        this.players = new LinkedList<Player>();

        // For 2 Players
        PlayingPiece crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player 1", crossPiece,sizeOfBoard);

        PlayingPiece noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player 2", noughtsPiece,sizeOfBoard);

        players.add(player1);
        players.add(player2);

        // Initialize the board
        this.gameBoard = new Board(sizeOfBoard);
    }

    public String startGame() {

        boolean noWinner = true;
        Scanner sc = new Scanner(System.in);

        try {

            while (noWinner) {

                // take out the player whose turn is and also put the player in the list basck
                Player playerTurn = players.removeFirst();

                // Get the free space from the board
                gameBoard.printBoard();
                boolean freeSpaces = gameBoard.isThereAnyFreeCells();

                if (!freeSpaces) {
                    noWinner = false;
                    continue;
                }

                System.out.println("Player: " + playerTurn.getName() + " Enter row,column index: ");
                String s = sc.nextLine();
                String[] values = s.split(",");
                int inputRow = Integer.valueOf(values[0]);
                int inputColumn = Integer.valueOf(values[1]);

                // Place the piece
                boolean pieceAddSuccessFully = gameBoard.addPiece(inputRow, inputColumn,
                        playerTurn.playingPiece);

                if (!pieceAddSuccessFully) {

                    // player can not insert the piece into this cell, player has to choose another
                    // cell
                    System.out.println("Incorrect position chosen, try again");
                    players.addFirst(playerTurn);
                    continue;
                }

                players.addLast(playerTurn);

                boolean isWinner = playerTurn.isWinner(inputRow, inputColumn);
                if (isWinner) {
                    gameBoard.printBoard();
                    return playerTurn.getName();
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }

        return "tie";
    }

   
}
