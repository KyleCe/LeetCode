package algorithm.easy;import java.util.HashMap;import java.util.Map;import test.foundation.S;public class FindJudge {    public int findJudge(int N, int[][] trust) {        if (trust.length == 0 && N == 1) return 1;        if (trust.length == 2 && N == 2) return -1;        Map<Integer, Integer> map = new HashMap<>();        int row = trust.length;        for (int i = 0; i < row; i++) {            map.put(trust[i][0], -1);            int key = trust[i][1];            if (!map.containsKey(key) || (map.containsKey(key) && map.get(key) != -1)) {                S.sop("map:k=", key, ",v=", map.getOrDefault(key, 0) + 1);                map.put(key, map.getOrDefault(key, 0) + 1);            }        }        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {            S.sop("map:k=", entry.getKey(), ",v=", entry.getValue());            if (entry.getValue() == N - 1) return entry.getKey();        }        return -1;    }}