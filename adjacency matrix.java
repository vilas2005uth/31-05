public class Main {
    public static void main(String[] args) {
        int n = 4; 
        int[][] adjacencyMatrix = new int[n][n];

        
        addEdge(adjacencyMatrix, 0, 1);
        addEdge(adjacencyMatrix, 0, 2);
        addEdge(adjacencyMatrix, 1, 2);
        addEdge(adjacencyMatrix, 2, 3);

        
        printMatrix(adjacencyMatrix);
    }

  
    public static void addEdge(int[][] matrix, int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1; 
    }

   
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
