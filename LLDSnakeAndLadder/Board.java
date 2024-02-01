package LLDSnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;
    int boardDimension;

    public Board(int boardDimension, int noOfSnakes, int noOfLadders) {

        this.boardDimension = boardDimension;
        this.cells = new Cell[boardDimension][boardDimension];

        for (int i = 0; i < boardDimension; i++) {
            for (int j = 0; j < boardDimension; j++) {
                Cell cell = new Cell();
                cells[i][j] = cell;
            }
        }

        addSnakeLadders(noOfSnakes, noOfLadders);
    }

    private void addSnakeLadders(int noOfSnakes, int noOfLadders) {

        while (noOfSnakes > 0) {

            int snakeHead = ThreadLocalRandom.current().nextInt(1, ((this.boardDimension * this.boardDimension) - 1));
            int snakeTail = ThreadLocalRandom.current().nextInt(1, ((this.boardDimension * this.boardDimension) - 1));

            if (snakeTail >= snakeHead) {
                continue;
            }

            Cell cell = getCell(snakeHead);

            if (cell.getJump() != null) {
                continue;
            }

            Jump snakeObj = new Jump(snakeHead, snakeTail);

            cell.setJump(snakeObj);
            noOfSnakes--;
        }

        while (noOfLadders > 0) {

            int ladderHead = ThreadLocalRandom.current().nextInt(1, ((this.boardDimension * this.boardDimension) - 1));
            int ladderTail = ThreadLocalRandom.current().nextInt(1, ((this.boardDimension * this.boardDimension) - 1));

            if (ladderHead >= ladderTail) {
                continue;
            }

            Cell cell = getCell(ladderHead);

            if (cell.getJump() != null) {
                continue;
            }

            Jump ladderObj = new Jump(ladderHead, ladderTail);

            cell.setJump(ladderObj);
            noOfLadders--;

        }
    }

    private Cell getCell(int cellNumber) {

        int rowIndex = cellNumber / boardDimension;
        int colIndex = cellNumber % boardDimension;

        Cell cell = cells[rowIndex][colIndex];
        return cell;

    }

    public int jumpCheck(int cellNumber) {

        if (cellNumber > (boardDimension * boardDimension) - 1) {
            return cellNumber;
        }

        Cell currCell = getCell(cellNumber);
        Jump currJump = currCell.getJump();

        if (currJump != null && currJump.start == cellNumber) {
            String jumpBy = (currJump.start < currJump.end) ? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);

            return currJump.end;
        }

        return cellNumber;

    }

}
