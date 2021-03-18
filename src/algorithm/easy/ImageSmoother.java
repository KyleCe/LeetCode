package algorithm.easy;

import org.junit.Test;

import algorithm.base.Base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by KyleCe on 2021/3/15
 * <p>
 * Input:
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * Output:
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 * Explanation:
 * For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
 * For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
 * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
 */
public class ImageSmoother extends Base {

    @Test
    public void test() {
        {
            int[][] input = {
                    {2, 3, 4},
                    {5, 6, 7},
                    {8, 9, 10},
                    {11, 12, 13},
                    {14, 15, 16},
            };
            int[][] output = {
                    {4, 4, 5},
                    {5, 6, 6},
                    {8, 9, 9},
                    {11, 12, 12},
                    {13, 13, 14},
            };
            assertTrue(equal(imageSmoother(input), output));
        }


        assertEquals(0f, Math.floor(0.0), 0.0);
        assertEquals(0f, Math.floor(0.4), 0.0);
        assertEquals(1f, Math.floor(1.0), 0.0);
    }

    public int[][] imageSmoother(int[][] M) {
        int lenR = M.length;
        int lenC = M[0].length;
        int[][] result = new int[lenR][lenC];
        //int[][] RB = new int[lenR][lenC];
        //int[] calResult;
        for (int i = 0; i < lenR; i++) {
            for (int j = 0; j < lenC; j++) {
                //if (i - 1 >= 0 && j - 1 >= 0 && RB[i - 1][j - 1] != 0) {
                //    calResult = calWithLT(M, i, j, RB[i - 1][j - 1]);
                //} else {
                //    calResult = calFully(M, i, j);
                //}
                //result[i][j] = calResult[0];
                //RB[i][j] = calResult[1];

                result[i][j] = calOrigin(M, i, j);
            }
        }

        return result;
    }

    private int[] calWithLT(int[][] M, int i, int j, int lt) {
        int iStart = Math.max(i - 1, 0);
        int jStart = Math.max(j - 1, 0);
        int iEnd = Math.min(i + 1, M.length - 1);
        int jEnd = Math.min(j + 1, M[0].length - 1);

        int rb = 0, cur;
        int sum = lt;
        //log("calWithLT:i=", i, ",j=", j, ",lt=", lt);

        for (int m = iStart; m <= iEnd; m++) {
            for (int n = jStart; n <= jEnd; n++) {
                cur = M[m][n];

                if (m <= i && n <= j) {
                    // do nothing

                } else {
                    sum += cur;
                    ////log("sum:m=", m, ",n=", n, ",cur=", cur, ",sum=", sum);
                }

                if (m >= i && n >= j) {
                    ////log("RB:m=", m, ",n=", n);
                    rb += cur;
                }

                //count++;
            }
        }

        int count = ((iEnd - iStart + 1) * (jEnd - jStart + 1));

        //log("calWithLT result:i=", i, ",j=", j, ",lt=", lt, ",re=", sum / count);
        return new int[]{sum / count, rb};
    }

    private int[] calFully(int[][] M, int i, int j) {
        int iStart = Math.max(i - 1, 0);
        int jStart = Math.max(j - 1, 0);
        int iEnd = Math.min(i + 1, M.length - 1);
        int jEnd = Math.min(j + 1, M[0].length - 1);

        int rb = 0;
        int sum = 0;
        ////log("calFully:i=", i, ",j=", j);
        int rbOrigin = 0;

        for (int m = iStart; m <= iEnd; m++) {
            for (int n = jStart; n <= jEnd; n++) {
                sum += M[m][n];
                if (m >= i && n >= j) {
                    rbOrigin = rb;
                    //log("calFully RB:m=", m,",n=",n,"M[m][n]=",M[m][n], ", rbOrigin=", rbOrigin, ", rb=", rb);
                    rb += M[m][n];
                }
                //count++;
            }
        }

        //log("calFully result:i=", i, ",j=", j, ",re=", sum / count);
        int count = ((iEnd - iStart + 1) * (jEnd - jStart + 1));
        return new int[]{sum / count, rb};
    }

    private int calOrigin(int[][] M, int i, int j) {
        int iStart = Math.max(i - 1, 0);
        int jStart = Math.max(j - 1, 0);
        int iEnd = Math.min(i + 1, M.length - 1);
        int jEnd = Math.min(j + 1, M[0].length - 1);

        int sum = 0;
        int count = 0;
        for (int m = iStart; m <= iEnd; m++) {
            for (int n = jStart; n <= jEnd; n++) {
                sum += M[m][n];
                count++;
            }
        }

        return sum / count;
    }
}

