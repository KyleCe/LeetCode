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
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1},
            };
            int[][] output = {
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
            };
            assertTrue(equal(imageSmoother(input), output));
        }


        assertEquals(0f, Math.floor(0.0), 0.0);
        assertEquals(0f, Math.floor(0.4), 0.0);
        assertEquals(1f, Math.floor(1.0), 0.0);
    }

    private boolean equal(int[][] A, int[][] B) {
        for (int i = 0, j = 0, len1 = A.length, len2 = A[0].length; i < len1 && j < len2; i++, j++) {
            if (A[i][j] != B[i][j]) return false;
        }
        return true;
    }

    public int[][] imageSmoother(int[][] M) {
        int lenR = M.length;
        int lenC = M[0].length;
        int[][] result = new int[lenR][lenC];
        for (int i = 0; i < lenR; i++) {
            for (int j = 0; j < lenC; j++) {
                result[i][j] = cal(M, i, j);
            }
        }

        return result;
    }

    private int cal(int[][] M, int i, int j) {
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

