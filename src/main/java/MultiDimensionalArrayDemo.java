import java.util.Arrays;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4};
        int[][] multi = {
                {1, 2, 3},
                {1, 3, 4, 5, 6, 7},
                {1, 2, 3}
        };

        System.out.println(Arrays.deepToString(multi));

        System.out.println("==========================");
        int[][] multi2 = new int[3][];
        System.out.println(Arrays.deepToString(multi2));

        for (int i = 0; i < multi2.length; i++) {
            multi2[i] = new int[i + 2];
            for (int j = 0; j < multi2[i].length; j++) {
                multi2[i][j] = 100 * i + j;
            }
        }
        System.out.println(Arrays.deepToString(multi2));

    }
}
