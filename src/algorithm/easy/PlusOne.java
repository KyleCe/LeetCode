package algorithm.easy;import test.foundation.S;public class PlusOne {    public int[] plusOne(int[] arr) {        int len = arr.length;        int i = len - 1;        boolean first9 = arr[0] == 9;        for (; i >= 0; i--) {            if (arr[i] == 9) {                arr[i] = 0;            } else {                arr[i]++;                break;            }        }        S.sop(first9);        S.sop(i);        if (i == -1 && first9) {            int[] res = new int[len + 1];            res[0] = 1;            System.arraycopy(arr, 0, res, 1, len);            return res;        }        return arr;    }}