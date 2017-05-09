package algorithm.easy;

import java.util.*;

/**
 * Created by Kyle on 09/05/2017.
 */
public class IntersectionOfTwoArray {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) res[i++] = num;
        return res;
    }

    public int[] intersectionWithNoDuplicate(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectSet = new HashSet<>();
        for (Integer i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) intersectSet.add(i);
        }
        int i = 0;
        int[] result = new int[intersectSet.size()];
        for (int num : intersectSet) {
            result[i++] = num;
        }
        return result;
    }
}
