package test.easy;import org.junit.Test;import algorithm.easy.HammingDistance;import algorithm.easy.NRepeatedElement;import test.foundation.S;public class NRepeatedElementTest {    @Test    public void repeatedNTimes() {        NRepeatedElement nRepeatedElement = new NRepeatedElement();        int[] a = {1, 2, 3, 3};        System.out.print(nRepeatedElement.repeatedNTimes(a));    }    @Test    public void byteTest() {        Integer xor = 1 ^ 4;        S.sop(Integer.toBinaryString(xor));        S.sop(new HammingDistance().hammingDistance(1, 4));    }}