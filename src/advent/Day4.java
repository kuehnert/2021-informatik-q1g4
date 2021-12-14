import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4 {
    private static void drawNumber(int n, List<int[]> boards) {
        System.out.println("Drawing " + n + ": ");
        for (int[] board : boards) {
            for (int i = 0; i < board.length; i++) {
                if (board[i] == n) {
                    board[i] = -1;
                }
            }

            System.out.println(Arrays.toString(board));
        }
    }

    private static void part1() {
        String string = Util.loadString("Day4Test.txt");
        String[] strings = string.split("\n\n");

        // parse numbers
        String[] numbersStr = strings[0].split(",");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        // parse bingo boards
        List<int[]> boards = new ArrayList<>();
        for (int i = 1; i < strings.length; i++) {
            System.out.println(strings[i]);
            // System.out.println(Arrays.toString(strings[i]));
            String[] bs = strings[i].replace("\n", " ").trim().split("\s+");
            System.out.println(Arrays.toString(bs));
            int[] bn = new int[25];
            for (int j = 0; j < bs.length; j++) {
                bn[j] = Integer.parseInt(bs[j]);
            }

            boards.add(bn);
        }

        // draw numbers
        int numberCounter = 0;
        while (numberCounter < numbers.length) {
            drawNumber(numbers[numberCounter], boards);

            numberCounter++;
        }
    }
    public static void main(String[] args) {
        part1();
    }
}
