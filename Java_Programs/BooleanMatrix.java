import java.util.Arrays;

public class BooleanMatrix {
    public static void modifyMatrix(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        boolean[] row = new boolean[M];
        boolean[] col = new boolean[N];

        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

       
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 0}, {0, 0}};
        int[][] mat2 = {{0, 0, 0}, {0, 0, 1}};
        int[][] mat3 = {{1, 0, 0, 1}, {0, 0, 1, 0}, {0, 0, 0, 0}};

        System.out.println("Input:");
        printMatrix(mat1);
        modifyMatrix(mat1);
        System.out.println("Output:");
        printMatrix(mat1);

        System.out.println("\nInput:");
        printMatrix(mat2);
        modifyMatrix(mat2);
        System.out.println("Output:");
        printMatrix(mat2);

        System.out.println("\nInput:");
        printMatrix(mat3);
        modifyMatrix(mat3);
        System.out.println("Output:");
        printMatrix(mat3);
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}

