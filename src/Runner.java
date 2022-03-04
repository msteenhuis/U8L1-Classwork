import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[][] twoArr = {{5, 3}, {5, 5}, {5, 5}};

        boolean output = false;
        int locRow = 0;
        int locCol = 0;

        for (int c = 0; c < twoArr[0].length; c++) {
            int fauxR = 0;
            for (int r = 1; r < twoArr.length; r++)
            {
                boolean ifDuplicate = twoArr[r][c] == twoArr[fauxR][c];
                if (ifDuplicate)
                {
                   int locR = fauxR;
                   int locC = c;
                   output = true;
                   System.out.println(ifDuplicate + " At row: " + locR + " and column: " + locC + ".");
                }
                fauxR++;
            }
        }
        System.out.println(output);
    }
}
