package algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle on 21/04/2017.
 * <p>
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * For example, given numRows = 5,
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);

        if (numRows == 0) return result;
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        result.add(tmp);

        for (int i = 0; i < numRows; i++) {
            tmp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (result.get(i) == null) continue;
                tmp.add(j, result.get(i).get(j));
            }
            result.add(tmp);
        }
        return result;
    }
}
