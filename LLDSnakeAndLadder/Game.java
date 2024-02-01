package LLDSnakeAndLadder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {

    Board board;
    int boardDimension;
    Dice dice;
    Deque<Player> playerList;
    Player winner;

    public Game(){
        this.boardDimension = 10;
        this.board = new Board(10, 8, 8);
        this.dice = new Dice(2, 1, 6);
        this.playerList = new ArrayDeque<>();
        addAllPlayers();

    }

    private void addAllPlayers(){
        Player player1 = new Player("Jigar", 0);
        Player player2 = new Player("Neel", 0);
        playerList.offer(player1);
        playerList.offer(player2);
    }

    public void startGame(){

        while(winner == null){

            Player currentPlayer = getPlayerTurn();
            int currentPosition = currentPlayer.getCurrentPosition();
            System.out.println("player turn is:" + currentPlayer.getPlayerName() + " current position is: " + currentPosition);


            int diceNumbers = dice.rollDice();
            int newPosition = currentPosition + diceNumbers;
            System.out.println("player " + currentPlayer.getPlayerName() + " new position after roll Dice is: " + newPosition);


            newPosition = board.jumpCheck(newPosition);
            currentPlayer.setCurrentPosition(newPosition);

            if(newPosition >= (boardDimension * boardDimension) - 1){
                winner = currentPlayer;
            }

            System.out.println("player " + currentPlayer.getPlayerName() + " new position is: " + newPosition);
            System.out.println();
        }
        System.out.println("WINNER IS: " + winner.getPlayerName());
    }
    private Player getPlayerTurn(){

        Player player = playerList.peekFirst();
        playerList.pollFirst();
        playerList.offerLast(player);

        return player;
    }
    
}
