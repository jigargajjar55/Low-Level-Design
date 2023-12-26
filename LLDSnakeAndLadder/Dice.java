package LLDSnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int min;
    int max;
    int diceCount;

    public Dice(int diceCount, int min, int max) {
        this.diceCount = diceCount;
        this.min = min;
        this.max = max;
    }

    public int rollDice() {

        int diceSum = 0;

        int count = 0;

        while (count < diceCount) {

            int currentNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            diceSum += currentNum;

            count++;
        }

        return diceSum;

    }

}
