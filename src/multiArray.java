public class multiArray {
    public multiArray() {
    }

    public static void main(String[] args) {
        int rows = 6;
        int colums = 5;
        int[][] aryNumbers = new int[rows][colums];
        aryNumbers[0][0] = 10;
        aryNumbers[0][1] = 12;
        aryNumbers[0][2] = 43;
        aryNumbers[0][3] = 11;
        aryNumbers[0][4] = 22;
        aryNumbers[1][0] = 20;
        aryNumbers[1][1] = 45;
        aryNumbers[1][2] = 56;
        aryNumbers[1][3] = 1;
        aryNumbers[1][4] = 33;

        for(int i = 0; i < rows; ++i) {
            System.out.print("[");

            for(int j = 0; j < colums; ++j) {
                if (j == colums - 1) {
                    System.out.print(aryNumbers[i][j] + " ");
                } else {
                    System.out.print(aryNumbers[i][j] + " , ");
                }
            }

            System.out.print("]");
            System.out.print(",");
            System.out.println("");
        }

    }
}

