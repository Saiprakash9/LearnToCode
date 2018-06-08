
public class Matrix {

    public static void main(String[] args) {

        int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] B = new int[10][10];
        System.out.print("{");
        for (int i = 0; i < A.length; i++) {
            System.out.print("{");
            for (int j = A[i].length - 1; j >= 0; j--) {
                B[i][A[i].length - j - 1] = A[i][j];
                if (B[i][A[i].length - j - 1] == 0) {
                    B[i][A[i].length - j - 1] = 1;
                } else {
                    B[i][A[i].length - j - 1] = 0;
                }
                System.out.print(B[i][A[i].length - j - 1] + ",");
            }
            System.out.print("}");
        }
        System.out.print("}");
    }

}
