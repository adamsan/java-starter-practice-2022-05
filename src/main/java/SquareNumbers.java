/**
 * Square of positives
 * <p>
 * Write a program, that prints out the squares:
 * - of the first 10 positive numbers.
 */
public class SquareNumbers {
    public static void main(String[] args) {
        int[] numbers = range(5, 10);
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i] * numbers[i];
            System.out.println(x);
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
}
