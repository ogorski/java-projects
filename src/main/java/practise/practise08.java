package practise;

import java.util.*;

public class practise08 {
    public static void print(String s) {
        System.out.print(s);
    }
    static int random_Int(int from, int to) {
        int count = (int) (Math.random() * (to - from + 1) + from);
        return count;
    }
    static String[][] matrix(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                print("\t" + array[i][j] + "\t" + "|");
            }
            System.out.println();
        }
        return array;
    }
    static String[][] matrix(String[][] array, String n, int hitCol, int hitRow) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[hitRow][hitCol] = n;
                print("\t" + array[i][j] + "\t" + "|");
            }
            System.out.println();
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int targetRow = random_Int(1, 5);
        int targetCol = random_Int(1, 5);
        print("Game is set! \n");
        String[][] gameField = {
                {"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"}
        };
        String[][] field = matrix(gameField);
        for (; ;) {
            print("\n Input number of column: ");
            int hitCol = in.nextInt();
            print("\n Input number of row: ");
            int hitRow = in.nextInt();
            if (hitCol > gameField.length - 1) {
                print("\n Try again, wrong column");
            } if (hitRow > gameField.length - 1) {
                print("\n Try again, wrong row");
            } if (hitRow <= gameField.length - 1 && hitCol <= gameField.length - 1) {
                print("\n");
                String[][] game = matrix(gameField, "*", hitCol, hitRow);
            } if (targetRow == hitRow && targetCol == hitCol) {
                print("\n U win");
                String[][] win = matrix(gameField, "X", hitCol, hitRow);
                break;
            }
        }
    }
}
