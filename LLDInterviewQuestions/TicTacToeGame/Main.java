package LLDInterviewQuestions.TicTacToeGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("How many Players will play game?");
            int noOfPlayers = sc.nextInt();

            System.out.println("Size of Board (2 to 10)?");
            int sizeOfBoard = sc.nextInt();

            TicTacToeGame game = new TicTacToeGame(noOfPlayers, sizeOfBoard);
            System.out.println("Game Winner is: " + game.startGame());


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }

    }

}
