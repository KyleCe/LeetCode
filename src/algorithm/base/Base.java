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
