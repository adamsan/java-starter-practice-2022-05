import java.util.Arrays;

/**
 * Square of positives
 * <p>
 * Write a program, that prints out the squares:
 * - of the first 10 positive numbers.
 * - if a number is negative, print out zero instead if the square
 */
public class SquareNumbers {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        int[] numbers = range(start, end);
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            int y = calculate(x);
            System.out.println(x + " -> " + y);
        }
    }

    public static int[] range(int start, int end) {
        int length = end - start;
        if (length <= 0) {
            return new int[0];
        }
        int[] result = new int[length]; // = new int[] {1,2,3};
        // 5, 6, 7, 8, 9
        for (int i = 0; i < result.length; i++) {
            result[i] = i + start;
        }
        return result;
    }

    public static int calculate(int i) {
        if (i < 0) return 0;
        else return i * i;
//        return (i < 0) ? 0 : i * i;
    }
}
