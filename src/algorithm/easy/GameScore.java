package algorithm.easy;import java.util.Stack;import test.foundation.S;public class GameScore {    public int calPoints(String[] ops) {        int last2 = 0;        int last1 = 0;        int sum = 0;        int roundScore = 0;        Stack<Integer> validSet = new Stack<>();        for (String o : ops) {            switch (o) {                case "+": // sum of last two valid                    roundScore = last2 + last1;                    sum += roundScore;                    validSet.push(last2);                    last2 = last1;                    last1 = roundScore;                    break;                case "D": // double, - remains                    roundScore = last1* 2 ;                    sum += roundScore;                    validSet.push(last2);                    last2 = last1;                    last1 = roundScore;                    break;                case "C": // cancel last one                    roundScore = -last1;                    sum += roundScore;                    last1 = last2;                    last2 = validSet.empty() ? 0 : validSet.pop();                    break;                default:// Integer                    roundScore = Integer.valueOf(o);                    sum += roundScore;                    validSet.push(last2);                    last2 = last1;                    last1 = roundScore;                    break;            }            S.sop("ops:", o, ",roundScore:", roundScore, ",sum:", sum, ",last2:", last2, ",last1:", last1);            S.sop("-----------");        }        return sum;    }}