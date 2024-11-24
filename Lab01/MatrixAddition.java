package OOP.Lab01;


public class MatrixAddition {

    public static void main(String[] args) {

        int mat_size = 3;
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][] mat3 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        int[][] res = new int[mat_size][mat_size];


        for (int i = 0; i < mat_size; i++) {
            for (int j = 0; j < mat_size; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < mat_size; i++) {
            for (int j = 0; j < mat_size; j++) {

                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

