package algorithm.base;

import org.junit.Test;

/**
 * Created by KyleCe on 2021/3/14
 */
public class Base {
    public String TAG = "Base";

    @Test
    public void main() {

    }

    public boolean equal(int[][] A, int[][] B) {
        return equal(A, B, true);
    }

    public boolean equal(int[][] A, int[][] B, boolean printLog) {
        for (int i = 0, j = 0, lenR = A.length, lenC = A[0].length; i < lenR && j < lenC; i++, j++) {
            if (A[i][j] != B[i][j]) {
                if (printLog) {
                    log("not equal:", "i=", i, ", j=", j, ", A[i][j]=", A[i][j], ", B[i][j]=", B[i][j]);
                }
                return false;
            }
        }
        return true;
    }

    public void log(Object... os) {
        if (os == null || os.length == 0) {
            System.out.println();
            return;

        }

        StringBuilder sb = new StringBuilder(TAG);
        for (Object o : os) {
            sb.append(" ").append(o);
        }
        System.out.println(sb);
    }
}
