import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the maze (n): ");
        int n = scanner.nextInt();
        int[][] maze = new int[n][n];

        System.out.println("Enter the maze matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        List<String> paths = ratMaze(maze);

        if (paths.isEmpty()) {
            System.out.println("No path found!");
        } else {
            System.out.println("Paths found:");
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }

    public static List<String> ratMaze(int[][] mat) {
        List<String> result = new ArrayList<>();
        int n = mat.length;
        int[][] visited = new int[n][n];

        if (mat[0][0] == 1) {
            solve(mat, result, n, 0, 0, visited, "");
        }
        return result;
    }

    public static void solve(int[][] mat, List<String> result, int n, int i, int j, int[][] visited, String path) {
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }

        visited[i][j] = 1; 

        // Downward
        if (i + 1 < n && visited[i + 1][j] == 0 && mat[i + 1][j] == 1) {
            solve(mat, result, n, i + 1, j, visited, path + 'D');
        }

        // Upward
        if (i - 1 >= 0 && visited[i - 1][j] == 0 && mat[i - 1][j] == 1) {
            solve(mat, result, n, i - 1, j, visited, path + 'U');
        }

        // Left
        if (j - 1 >= 0 && visited[i][j - 1] == 0 && mat[i][j - 1] == 1) {
            solve(mat, result, n, i, j - 1, visited, path + 'L');
        }

        // Right
        if (j + 1 < n && visited[i][j + 1] == 0 && mat[i][j + 1] == 1) {
            solve(mat, result, n, i, j + 1, visited, path + 'R');
        }

        visited[i][j] = 0; 
    }
}
